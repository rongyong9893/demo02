package com.example.demo.pojo;

import java.util.Date;

/**
 * @author rongyong
 * @date 2018/9/23 0023 上午 12:14
 */
public class User {

    private Integer id;

    private String name;

    private String mobile;

    private Date birthday;

    private String email;

    private Integer did;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", did=" + did +
                '}';
    }
}
