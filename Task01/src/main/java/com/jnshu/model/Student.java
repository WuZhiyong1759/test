package com.jnshu.model;

import java.io.Serializable;

/**
 * Created by Tom on 2017/4/14.
 */
public class Student implements Serializable{
    private int id;
    private String name;
    private String password;
    private String arrival_time;
    private String qq;
    private String study_type;
    private String number_online;
    private String diary_link;
    private String school;
    private String vow;
    private String assessor;
    private String referee;
    private Long create_at;
    private Long update_at;
    private String vocation;
    private String introduce;
    private int fin;

    public Student() {
        super();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getStudy_type() {
        return study_type;
    }

    public void setStudy_type(String study_type) {
        this.study_type = study_type;
    }

    public String getNumber_online() {
        return number_online;
    }

    public void setNumber_online(String number_online) {
        this.number_online = number_online;
    }

    public String getDiary_link() {
        return diary_link;
    }

    public void setDiary_link(String diary_link) {
        this.diary_link = diary_link;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getVow() {
        return vow;
    }

    public void setVow(String vow) {
        this.vow = vow;
    }

    public String getAssessor() {
        return assessor;
    }

    public void setAssessor(String assessor) {
        this.assessor = assessor;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public Long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Long create_at) {
        this.create_at = create_at;
    }

    public Long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Long update_at) {
        this.update_at = update_at;
    }


    public String getVocation(){
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", arrival_time='" + arrival_time + '\'' +
                ", qq='" + qq + '\'' +
                ", study_type='" + study_type + '\'' +
                ", number_online='" + number_online + '\'' +
                ", diary_link='" + diary_link + '\'' +
                ", school='" + school + '\'' +
                ", vow='" + vow + '\'' +
                ", assessor='" + assessor + '\'' +
                ", referee='" + referee + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", vocation='" + vocation + '\'' +
                ", introduce='" + introduce + '\'' +
                ", fin=" + fin +
                '}';
    }
}
