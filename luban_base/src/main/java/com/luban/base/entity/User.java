package com.luban.base.entity;

public class User {
   private String username;
   private String password;
   private String nickname;
   private String birthday;
   private String motherland;
   private String hobby;
   private Integer age;
   private Boolean iscp;
   private String school;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMotherland() {
        return motherland;
    }

    public void setMotherland(String motherland) {
        this.motherland = motherland;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIscp() {
        return iscp;
    }

    public void setIscp(Boolean iscp) {
        this.iscp = iscp;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
