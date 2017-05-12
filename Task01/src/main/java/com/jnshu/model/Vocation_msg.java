package com.jnshu.model;

/**
 * Created by Tom on 2017/4/26.
 */
public class Vocation_msg {
    private int id;
    private String vocation;//职业类型
    private String vocation_itrduc;//职业介绍；
    private int sill;//门槛
    private int sill_liv;//难易程度
    private String grow_cyc;//成长周期
    private int rare_liv;//稀缺程度
    private String t1;//薪资待遇第一阶段的时间周期
    private String k1;//薪资待遇第一阶段的薪资水平
    private String t2;//薪资待遇第二阶段的时间周期
    private String k2;//薪资待遇第二阶段的薪资水平
    private String t3;//薪资待遇第三阶段的时间周期
    private String k3;//薪资待遇第三阶段的薪资水平
    private int study_num;//在学人数
    private String hint_msg;//提示信息
    private String h1;//职业方向
    private String h2;//职业方向的类标题（前端开发方向、后端开发方向等）


    public Vocation_msg() {
        super();
    }

    public Vocation_msg(String vocation, String vocation_itrduc, int sill, int sill_liv, String grow_cyc, int rare_liv, String t1, String k1, String t2, String k2, String t3, String k3, int study_num, String hint_msg,String h1,String h2) {
        this.vocation = vocation;
        this.vocation_itrduc = vocation_itrduc;
        this.sill = sill;
        this.sill_liv = sill_liv;
        this.grow_cyc = grow_cyc;
        this.rare_liv = rare_liv;
        this.t1 = t1;
        this.k1 = k1;
        this.t2 = t2;
        this.k2 = k2;
        this.t3 = t3;
        this.k3 = k3;
        this.study_num = study_num;
        this.hint_msg = hint_msg;
        this.h1=h1;
        this.h2=h2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    public String getVocation_itrduc() {
        return vocation_itrduc;
    }

    public void setVocation_itrduc(String vocation_itrduc) {
        this.vocation_itrduc = vocation_itrduc;
    }

    public int getSill() {
        return sill;
    }

    public void setSill(int sill) {
        this.sill = sill;
    }

    public int getSill_liv() {
        return sill_liv;
    }

    public void setSill_liv(int sill_liv) {
        this.sill_liv = sill_liv;
    }

    public String getGrow_cyc() {
        return grow_cyc;
    }

    public void setGrow_cyc(String grow_cyc) {
        this.grow_cyc = grow_cyc;
    }

    public int getRare_liv() {
        return rare_liv;
    }

    public void setRare_liv(int rare_liv) {
        this.rare_liv = rare_liv;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getK1() {
        return k1;
    }

    public void setK1(String k1) {
        this.k1 = k1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public String getK2() {
        return k2;
    }

    public void setK2(String k2) {
        this.k2 = k2;
    }

    public String getT3() {
        return t3;
    }

    public void setT3(String t3) {
        this.t3 = t3;
    }

    public String getK3() {
        return k3;
    }

    public void setK3(String k3) {
        this.k3 = k3;
    }

    public int getStudy_num() {
        return study_num;
    }

    public void setStudy_num(int study_num) {
        this.study_num = study_num;
    }

    public String getHint_msg() {
        return hint_msg;
    }

    public void setHint_msg(String hint_msg) {
        this.hint_msg = hint_msg;
    }

    public String getH1() {
        return h1;
    }

    public void setH1(String h1) {
        this.h1 = h1;
    }

    public String getH2() {
        return h2;
    }

    public void setH2(String h2) {
        this.h2 = h2;
    }

    @Override
    public String toString() {
        return "Vocation_msg{" +
                "id=" + id +
                ", vocation='" + vocation + '\'' +
                ", vocation_itrduc='" + vocation_itrduc + '\'' +
                ", sill=" + sill +
                ", sill_liv=" + sill_liv +
                ", grow_cyc='" + grow_cyc + '\'' +
                ", rare_liv=" + rare_liv +
                ", t1='" + t1 + '\'' +
                ", k1='" + k1 + '\'' +
                ", t2='" + t2 + '\'' +
                ", k2='" + k2 + '\'' +
                ", t3='" + t3 + '\'' +
                ", k3='" + k3 + '\'' +
                ", study_num=" + study_num +
                ", hint_msg='" + hint_msg + '\'' +
                ", h1='" + h1 + '\'' +
                ", h2='" + h2 + '\'' +
                '}';
    }
}
