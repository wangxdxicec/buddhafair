package com.jasson.im.api;

/**
 * Created by Administrator on 2016/3/21.
 */
public class MOItem {
    private String mobile_;
    private long smID_;
    private String content_;
    private String moTime;
    private int msgFmt;

    public MOItem() {
    }

    public String getContent() {
        return this.content_;
    }

    public void setContent(String content) {
        this.content_ = content;
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

    public String getMoTime() {
        return this.moTime;
    }

    public void setMoTime(String moTime) {
        this.moTime = moTime;
    }

    public int getMsgFmt() {
        return this.msgFmt;
    }

    public void setMsgFmt(int msgFmt) {
        this.msgFmt = msgFmt;
    }
}
