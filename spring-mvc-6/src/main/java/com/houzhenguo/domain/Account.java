package com.houzhenguo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
    private UserA user;
    private List<UserA> list;
    private Map<String, UserA> map;
    private Date birth;

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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public UserA getUser() {
        return user;
    }

    public void setUser(UserA user) {
        this.user = user;
    }

    public List<UserA> getList() {
        return list;
    }

    public void setList(List<UserA> list) {
        this.list = list;
    }

    public Map<String, UserA> getMap() {
        return map;
    }

    public void setMap(Map<String, UserA> map) {
        this.map = map;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", user=" + user +
                ", list=" + list +
                ", map=" + map +
                ", birth=" + birth +
                '}';
    }
}
class User implements Serializable {
    private int sex = 0;
    private String name = "";

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
}
