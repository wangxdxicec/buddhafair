package com.jasson.im.api;

/**
 * Created by Administrator on 2016/3/21.
 */
public class RPTItem {
    private String mobile_;
    private long smID_;
    private int code_;
    private String desc_;
    private String rptTime;

    public RPTItem() {
    }

    public int getCode() {
        return this.code_;
    }

    public void setCode(int code) {
        this.code_ = code;
    }

    public String getDesc() {
        return this.desc_;
    }

    public void setDesc(String desc) {
        this.desc_ = desc;
    }

    public String getMobile() {
        return this.mobile_;
    }

    public void setMobile(String mobile) {
        this.mobile_ = mobile;
    }

    public long getSmID() {
        return this.smID_;
    }

    public void setSmID(long smID) {
        this.smID_ = smID;
    }

    public String getRptTime() {
        return this.rptTime;
    }

    public void setRptTime(String rptTime) {
        this.rptTime = rptTime;
    }
}
