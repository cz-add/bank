package com.zking.bankprovider.model;

/**
 * 微信公共账号登记表(wx_accinfo)
 */
public class WxAccinfo {
    private String accno;//微信公共帐号(主键)

    private String accname;//公共帐号名称

    private String cname;//银行业务联系人

    private String phone;//联系电话

    private String platkey;//平台密钥

    private String summary;//备注（业务说明）

    private String operno;//维护操作员

    private String opertime;//维护时间

    private String state;//记录状态

    public WxAccinfo(String accno, String accname, String cname, String phone, String platkey, String summary, String operno, String opertime, String state) {
        this.accno = accno;
        this.accname = accname;
        this.cname = cname;
        this.phone = phone;
        this.platkey = platkey;
        this.summary = summary;
        this.operno = operno;
        this.opertime = opertime;
        this.state = state;
    }

    public WxAccinfo() {
        super();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlatkey() {
        return platkey;
    }

    public void setPlatkey(String platkey) {
        this.platkey = platkey;
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
}