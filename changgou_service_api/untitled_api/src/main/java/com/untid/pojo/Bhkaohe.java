package com.untid.pojo;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "bh_kaohe")
public class Bhkaohe implements Serializable {
    private Integer zbid;
    private Integer kebhid;

    public Integer getZbid() {
        return zbid;
    }

    public void setZbid(Integer zbid) {
        this.zbid = zbid;
    }

    public Integer getKebhid() {
        return kebhid;
    }

    public void setKebhid(Integer kebhid) {
        this.kebhid = kebhid;
    }
}
