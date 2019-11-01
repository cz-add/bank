package com.zking.bankprovider.model;

/**
 * 角色-功能表(t_role_gn)
 */
public class TRoleGn {
    private Integer rgid;//角色-功能id,唯一键

    private Integer rid;//角色id

    private String gdesc;//可以实现的功能

    private Integer available;//是否可用(0为可用,1为不可用)

    public TRoleGn(Integer rgid, Integer rid, String gdesc, Integer available) {
        this.rgid = rgid;
        this.rid = rid;
        this.gdesc = gdesc;
        this.available = available;
    }

    public TRoleGn() {
        super();
    }

    public Integer getRgid() {
        return rgid;
    }

    public void setRgid(Integer rgid) {
        this.rgid = rgid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }
}