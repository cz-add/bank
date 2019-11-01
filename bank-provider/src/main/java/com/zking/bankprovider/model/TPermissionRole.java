package com.zking.bankprovider.model;

/**
 * 权限角色表(t_permission_role)
 */
public class TPermissionRole {
    private Integer rrid;//权限角色id,唯一键

    private String pid;//权限id

    private Integer rid;//角色id

    public TPermissionRole(Integer rrid, String pid, Integer rid) {
        this.rrid = rrid;
        this.pid = pid;
        this.rid = rid;
    }

    public TPermissionRole() {
        super();
    }

    public Integer getRrid() {
        return rrid;
    }

    public void setRrid(Integer rrid) {
        this.rrid = rrid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}