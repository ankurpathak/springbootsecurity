package com.mike.springbootsecurity.respository;

import com.mike.springbootsecurity.entity.Checkers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Description TODO
 * @Author Mike
 * @Date 2019/1/14
 * @Version 1.0
 */
public interface CheckersRespository extends JpaRepository<Checkers, Long> {


    @Query("select new Checkers(openId,pin) from Checkers where name = ?1")
    Checkers getChecker(String name);
}
