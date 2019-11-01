package com.zking.bankprovider.model;

/**
 * 微信菜单表(wx_menu)
 */
public class WxMenu {
    private String accno;//微信公共帐号

    private String menuname;//主菜单名(不超过16个字节)

    private String subname;//子菜单名(如果为空，所有只有主菜单)(子菜单不超过40个字节)

    private Integer seqno;//菜单显示顺序

    private String menukey;//菜单KEY  MD5(帐号+主菜单名+子菜单名)

    private String summary;//备注（业务说明）

    private String operno;//维护操作员

    private String opertime;//维护时间

    private String state;//记录状态

    private String isupdate;//是否已变动需同步更新到微信服务器

    private String uptime;//更新时间

    private String upstate;//更新结果

    public WxMenu(String accno, String menuname, String subname, Integer seqno, String menukey, String summary, String operno, String opertime, String state, String isupdate, String uptime, String upstate) {
        this.accno = accno;
        this.menuname = menuname;
        this.subname = subname;
        this.seqno = seqno;
        this.menukey = menukey;
        this.summary = summary;
        this.operno = operno;
        this.opertime = opertime;
        this.state = state;
        this.isupdate = isupdate;
        this.uptime = uptime;
        this.upstate = upstate;
    }

    public WxMenu() {
        super();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Integer getSeqno() {
        return seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    public String getMenukey() {
        return menukey;
    }

    public void setMenukey(String menukey) {
        this.menukey = menukey;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getOperno() {
        return operno;
    }

    public void setOperno(String operno) {
        this.operno = operno;
    }

    public String getOpertime() {
        return opertime;
    }

    public void setOpertime(String opertime) {
        this.opertime = opertime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIsupdate() {
        return isupdate;
    }

    public void setIsupdate(String isupdate) {
        this.isupdate = isupdate;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getUpstate() {
        return upstate;
    }

    public void setUpstate(String upstate) {
        this.upstate = upstate;
    }
}