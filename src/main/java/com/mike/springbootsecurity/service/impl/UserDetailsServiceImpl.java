package com.mike.springbootsecurity.service.impl;

import com.mike.springbootsecurity.entity.Checkers;
import com.mike.springbootsecurity.respository.CheckersRespository;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author Mike
 * @Date 2019/1/16
 * @Version 1.0
 */
@Service("MyUserDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    private CheckersRespository checkersRespository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Checkers checker = checkersRespository.getChecker(username);


        if (checker != null) {
            return new User(username, passwordEncoder.encode(checker.getPin()),
                    AuthorityUtils.commaSeparatedStringToAuthorityList(""));
        } else {
            throw new UsernameNotFoundException("access denied");
        }


    }


}
