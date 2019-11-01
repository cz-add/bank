package com.zking.bankprovider.model;

/**
 * 数据字典表(t_dict)
 */
public class TDict {
    private Integer did;//字典id,唯一键

    private String dtype;//类型（手写）

    private String dcontent;//内容

    private String djs;//介绍

    public TDict(Integer did, String dtype, String dcontent, String djs) {
        this.did = did;
        this.dtype = dtype;
        this.dcontent = dcontent;
        this.djs = djs;
    }

    public TDict() {
        super();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getDcontent() {
        return dcontent;
    }

    public void setDcontent(String dcontent) {
        this.dcontent = dcontent;
    }

    public String getDjs() {
        return djs;
    }

    public void setDjs(String djs) {
        this.djs = djs;
    }
}