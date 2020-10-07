package com.untid.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "zj_table", schema = "kaohe", catalog = "")
public class ZjTableEntity {
    private Integer krRyid;
    private Integer krBmid;

    @Basic
    @Column(name = "kr_ryid")
    public Integer getKrRyid() {
        return krRyid;
    }

    public void setKrRyid(Integer krRyid) {
        this.krRyid = krRyid;
    }

    @Basic
    @Column(name = "kr_bmid")
    public Integer getKrBmid() {
        return krBmid;
    }

    public void setKrBmid(Integer krBmid) {
        this.krBmid = krBmid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZjTableEntity that = (ZjTableEntity) o;
        return Objects.equals(krRyid, that.krRyid) &&
                Objects.equals(krBmid, that.krBmid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(krRyid, krBmid);
    }
}
