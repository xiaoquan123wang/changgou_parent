package com.untid.pojo;

import javax.persistence.Table;
import javax.swing.*;
import java.io.Serializable;

@Table(name = "yh_kaohe")
public class Yhkaohe implements Serializable {
    private Integer zid;
    private Integer keyhid;

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getKeyhid() {
        return keyhid;
    }

    public void setKeyhid(Integer keyhid) {
        this.keyhid = keyhid;
    }
}
