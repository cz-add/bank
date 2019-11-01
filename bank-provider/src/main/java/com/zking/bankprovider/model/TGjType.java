package com.zking.bankprovider.model;

/**
 * 关键字类别表(t_gj_type)
 */
public class TGjType {
    private Integer gjid;//关键字类别id,唯一键

    private String type;//类别名称

    public TGjType(Integer gjid, String type) {
        this.gjid = gjid;
        this.type = type;
    }

    public TGjType() {
        super();
    }

    public Integer getGjid() {
        return gjid;
    }

    public void setGjid(Integer gjid) {
        this.gjid = gjid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}