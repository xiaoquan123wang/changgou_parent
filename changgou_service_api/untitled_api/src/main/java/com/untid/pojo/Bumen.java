package com.untid.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "bumen_tj")
public class Bumen implements Serializable {
    @Id
    private Integer bmid;
    private java.util.Date month;
    private String dp;
    private String dpscorezongs;
    private Integer dpName;
    private Float weight;

    public Integer getBmid() {
        return bmid;
    }

    public void setBmid(Integer bmid) {
        this.bmid = bmid;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getDpscorezongs() {
        return dpscorezongs;
    }

    public void setDpscorezongs(String dpscorezongs) {
        this.dpscorezongs = dpscorezongs;
    }

    public Integer getDpName() {
        return dpName;
    }

    public void setDpName(Integer dpName) {
        this.dpName = dpName;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
