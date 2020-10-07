package com.untid.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "bumen_tj", schema = "kaohe", catalog = "")
public class BumenTjEntity {
    private int krBmid;
    private Date khMonth;
    private String khDp;
    private String dpscoreZongs;
    private Integer dpName;
    private Double dpWeight;

    @Basic
    @Column(name = "kr_bmid")
    public int getKrBmid() {
        return krBmid;
    }

    public void setKrBmid(int krBmid) {
        this.krBmid = krBmid;
    }

    @Basic
    @Column(name = "kh_Month")
    public Date getKhMonth() {
        return khMonth;
    }

    public void setKhMonth(Date khMonth) {
        this.khMonth = khMonth;
    }

    @Basic
    @Column(name = "kh_Dp")
    public String getKhDp() {
        return khDp;
    }

    public void setKhDp(String khDp) {
        this.khDp = khDp;
    }

    @Basic
    @Column(name = "Dpscore_zongs")
    public String getDpscoreZongs() {
        return dpscoreZongs;
    }

    public void setDpscoreZongs(String dpscoreZongs) {
        this.dpscoreZongs = dpscoreZongs;
    }

    @Basic
    @Column(name = "Dp_Name")
    public Integer getDpName() {
        return dpName;
    }

    public void setDpName(Integer dpName) {
        this.dpName = dpName;
    }

    @Basic
    @Column(name = "Dp_weight")
    public Double getDpWeight() {
        return dpWeight;
    }

    public void setDpWeight(Double dpWeight) {
        this.dpWeight = dpWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BumenTjEntity that = (BumenTjEntity) o;
        return krBmid == that.krBmid &&
                Objects.equals(khMonth, that.khMonth) &&
                Objects.equals(khDp, that.khDp) &&
                Objects.equals(dpscoreZongs, that.dpscoreZongs) &&
                Objects.equals(dpName, that.dpName) &&
                Objects.equals(dpWeight, that.dpWeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(krBmid, khMonth, khDp, dpscoreZongs, dpName, dpWeight);
    }
}
