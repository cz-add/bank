package com.zking.bankprovider.model;

/**
 * 权限表(t_permission)
 */
public class TPermission {
    private Integer pid;//权限id,唯一键

    private String pname;//权限名

    private Integer level;//权限级别：暂只支持1~3，方便指定父权限,1无父编号

    private Integer ppid;//父编号

    private Integer available;//是否可用(0为可用,1为不可用)

    private String permission;//权限字符串

    public TPermission(Integer pid, String pname, Integer level, Integer ppid, Integer available, String permission) {
        this.pid = pid;
        this.pname = pname;
        this.level = level;
        this.ppid = ppid;
        this.available = available;
        this.permission = permission;
    }

    public TPermission() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}