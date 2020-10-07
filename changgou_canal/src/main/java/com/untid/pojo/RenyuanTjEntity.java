package com.untid.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "renyuan_tj", schema = "kaohe", catalog = "")
public class RenyuanTjEntity {
    private int krRyid;
    private Date khMonth;
    private String khName;
    private Integer khGrade;
    private Integer khDpscore;
    private Double khGeren;

    @Basic
    @Column(name = "kr_ryid")
    public int getKrRyid() {
        return krRyid;
    }

    public void setKrRyid(int krRyid) {
        this.krRyid = krRyid;
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
    @Column(name = "kh_Name")
    public String getKhName() {
        return khName;
    }

    public void setKhName(String khName) {
        this.khName = khName;
    }

    @Basic
    @Column(name = "kh_Grade")
    public Integer getKhGrade() {
        return khGrade;
    }

    public void setKhGrade(Integer khGrade) {
        this.khGrade = khGrade;
    }

    @Basic
    @Column(name = "kh_Dpscore")
    public Integer getKhDpscore() {
        return khDpscore;
    }

    public void setKhDpscore(Integer khDpscore) {
        this.khDpscore = khDpscore;
    }

    @Basic
    @Column(name = "kh_geren")
    public Double getKhGeren() {
        return khGeren;
    }

    public void setKhGeren(Double khGeren) {
        this.khGeren = khGeren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RenyuanTjEntity that = (RenyuanTjEntity) o;
        return krRyid == that.krRyid &&
                Objects.equals(khMonth, that.khMonth) &&
                Objects.equals(khName, that.khName) &&
                Objects.equals(khGrade, that.khGrade) &&
                Objects.equals(khDpscore, that.khDpscore) &&
                Objects.equals(khGeren, that.khGeren);
    }

    @Override
    public int hashCode() {
        return Objects.hash(krRyid, khMonth, khName, khGrade, khDpscore, khGeren);
    }
}
