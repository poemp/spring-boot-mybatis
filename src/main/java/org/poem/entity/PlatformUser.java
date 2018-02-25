package org.poem.entity;

import java.util.Date;

/**
 * platform user
 */
public class PlatformUser {

    private String id;

    private String userName;

    private Integer age ;

    private Date ctm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }

    public PlatformUser() {
    }

    public PlatformUser(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }
}
