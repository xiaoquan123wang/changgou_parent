package com.untid.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "kh_kehao")
public class KaoHao {
    @Id
    private Integer keid;
    private String name;
    private  java.util.Date khmonth;
    private Integer score;
    private Integer kid;

    public Integer getKeid() {
        return keid;
    }

    public void setKeid(Integer keid) {
        this.keid = keid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getKhmonth() {
        return khmonth;
    }

    public void setKhmonth(Date khmonth) {
        this.khmonth = khmonth;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }
}
