package com.untid.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "kh_bumen")
public class KhBumen {
    @Id
    private Integer bid;
    private Integer uid;
    private String bunmen;
    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBunmen() {
        return bunmen;
    }

    public void setBunmen(String bunmen) {
        this.bunmen = bunmen;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
