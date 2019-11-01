package com.zking.bankprovider.model;

/**
 * 用户角色表(t_user_role)
 */
public class TUserRole {
    private Integer urid;//用户角色id,唯一键

    private String uid;// 用户账号

    private Integer rid;//角色id

    public TUserRole(Integer urid, String uid, Integer rid) {
        this.urid = urid;
        this.uid = uid;
        this.rid = rid;
    }

    public TUserRole() {
        super();
    }

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}