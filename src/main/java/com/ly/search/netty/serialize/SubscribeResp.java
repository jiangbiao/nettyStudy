package com.ly.search.netty.serialize;

import java.io.Serializable;

/**
 * Created by jb28755 on 2017/9/12.
 */
public class SubscribeResp implements Serializable {

    /**
     * 默认的序列号
     */
    private static final long serialVersionUID = 1L;

    private int subRepID;

    private int respCode;

    private String desc;

    public int getSubRepID() {
        return subRepID;
    }

    public void setSubRepID(int subRepID) {
        this.subRepID = subRepID;
    }

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "SubscribeResp{" +
                "subRepID=" + subRepID +
                ", respCode=" + respCode +
                ", desc='" + desc + '\'' +
                '}';
    }
}
