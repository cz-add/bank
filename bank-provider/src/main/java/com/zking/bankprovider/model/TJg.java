package com.zking.bankprovider.model;

/**
 * 机构设置表(t_jg)
 */
public class TJg {
    private Integer jgid;//机构设置id,唯一键

    private String jgname;//机构名称

    private String jgcz;//机构操作

    public TJg(Integer jgid, String jgname, String jgcz) {
        this.jgid = jgid;
        this.jgname = jgname;
        this.jgcz = jgcz;
    }

    public TJg() {
        super();
    }

    public Integer getJgid() {
        return jgid;
    }

    public void setJgid(Integer jgid) {
        this.jgid = jgid;
    }

    public String getJgname() {
        return jgname;
    }

    public void setJgname(String jgname) {
        this.jgname = jgname;
    }

    public String getJgcz() {
        return jgcz;
    }

    public void setJgcz(String jgcz) {
        this.jgcz = jgcz;
    }
}