package com.zking.bankprovider.model;

/**
 * 关键字表(t_gj)
 */
public class TGj {
    private Integer jid;//关键字id,唯一键

    private Integer gjid;//关键字类别id

    private String gjz;//关键字

    private String content;//关键字所发内容

    private String gimage;//关键字所发图片

    public TGj(Integer jid, Integer gjid, String gjz, String content, String gimage) {
        this.jid = jid;
        this.gjid = gjid;
        this.gjz = gjz;
        this.content = content;
        this.gimage = gimage;
    }

    public TGj() {
        super();
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getGjid() {
        return gjid;
    }

    public void setGjid(Integer gjid) {
        this.gjid = gjid;
    }

    public String getGjz() {
        return gjz;
    }

    public void setGjz(String gjz) {
        this.gjz = gjz;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
    }
}