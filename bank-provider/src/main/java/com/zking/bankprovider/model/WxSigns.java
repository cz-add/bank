package com.zking.bankprovider.model;

/**
 * 微信业务签约(wx_signs)
 */
public class WxSigns {
    private String accno;//微信号

    private String type;//业务类型  001 关注  002积分

    private String ostate;//操作状态 签约1（关注）取消签约0（取消关注）

    private String vouchertypeno;//业务凭证类型 C01银行卡 A01 帐号 CUST 平台客户号 HCNO主机客户号, K01 积分卡 W01 微信号 MALL商城客户号

    private String voucherno;//业务凭证号码

    private String operno;//维护操作员

    private String opertime;//维护时间

    public WxSigns(String accno, String type, String ostate, String vouchertypeno, String voucherno, String operno, String opertime) {
        this.accno = accno;
        this.type = type;
        this.ostate = ostate;
        this.vouchertypeno = vouchertypeno;
        this.voucherno = voucherno;
        this.operno = operno;
        this.opertime = opertime;
    }

    public WxSigns() {
        super();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOstate() {
        return ostate;
    }

    public void setOstate(String ostate) {
        this.ostate = ostate;
    }

    public String getVouchertypeno() {
        return vouchertypeno;
    }

    public void setVouchertypeno(String vouchertypeno) {
        this.vouchertypeno = vouchertypeno;
    }

    public String getVoucherno() {
        return voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
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
}