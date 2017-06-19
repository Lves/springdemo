package com.wildcat.model;

/**
 * Created by lixingle on 2017/6/2.
 */
public class Student {
    private Integer age;
    private String name;
    private Integer id;
    private String password;
    private String [] favoriteFrameworks;
    private String country;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getFavoriteFrameworks() {
        return favoriteFrameworks;
    }

    public void setFavoriteFrameworks(String[] favoriteFrameworks) {
        this.favoriteFrameworks = favoriteFrameworks;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
