package com.mike.springbootsecurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @Description user
 * @Author Mike
 * @Date 2019/1/14
 */

@Entity
@Table(name = "[Checkers]", schema = "[dbo]")
public class Checkers {
    @Id
    @Column(name = "[sn]")
    private long sn;

    @Column(name = "[OpenID]")
    private String openId;

    @Column(name = "[CitizenID]")
    private String citizenId;

    @Column(name = "[Name]", unique = true)
    private String name;

    @Column(name = "[PIN]")
    private String pin;

    @Column(name = "[Phone]")
    private String phone;

    @Column(name = "[Misc]")
    private String misc;

    @Column(name = "[Created]")
    private Timestamp created;

    @Column(name = "[Modified]")
    private Timestamp modified;

    @Column(name = "[Memo]")
    private String memo;

    @Column(name = "[Flag]")
    private long flag;

    @Column(name = "[Status]")
    private long status;

    public Checkers(String openId, String pin) {
        this.openId = openId;
        this.pin = pin;
    }

    public long getSn() {
        return sn;
    }

    public void setSn(long sn) {
        this.sn = sn;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public long getFlag() {
        return flag;
    }

    public void setFlag(long flag) {
        this.flag = flag;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }
}
