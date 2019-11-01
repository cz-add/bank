package com.zking.bankprovider.model;

/**
 * 用户表(t_user)
 */
public class TUser {
    private String uid;//用户账号，唯一键

    private String usex;//用户性别

    private String utel;//用户电话号码

    private String upwd;//用户密码

    private String uemail;//用户邮箱

    private String uimage;//用户头像

    private String utime;//用户注册时间

    public TUser(String uid, String usex, String utel, String upwd, String uemail, String uimage, String utime) {
        this.uid = uid;
        this.usex = usex;
        this.utel = utel;
        this.upwd = upwd;
        this.uemail = uemail;
        this.uimage = uimage;
        this.utime = utime;
    }

    public TUser() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUimage() {
        return uimage;
    }

    public void setUimage(String uimage) {
        this.uimage = uimage;
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
    }
}