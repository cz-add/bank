package com.zking.bankprovider.model;

/**
 * 角色表(t_role)
 */
public class TRole {
    private Integer rid;//角色id,唯一键

    private String rname;//角色名字

    private Integer desca;//角色描述

    private Integer available;//是否可用(0为可用,1为不可用)

    public TRole(Integer rid, String rname, Integer desca, Integer available) {
        this.rid = rid;
        this.rname = rname;
        this.desca = desca;
        this.available = available;
    }

    public TRole() {
        super();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getDesca() {
        return desca;
    }

    public void setDesca(Integer desca) {
        this.desca = desca;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }
}