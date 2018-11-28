package com.qy.domain;

import javax.persistence.*;

@Entity
@Table(name = "hyujia",schema = "yueke")
public class Hyujia {
    private int id;
    private Integer mId;
    private String address;
    private String type;
    private String himages;
    private String hname;
    private Integer state;
    private String ztime;
    private String dtime;
    private Integer masterId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "m_id")
    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "himages")
    public String getHimages() {
        return himages;
    }

    public void setHimages(String himages) {
        this.himages = himages;
    }

    @Basic
    @Column(name = "hname")
    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    @Basic
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "ztime")
    public String getZtime() {
        return ztime;
    }

    public void setZtime(String ztime) {
        this.ztime = ztime;
    }

    @Basic
    @Column(name = "dtime")
    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime;
    }

    @Basic
    @Column(name = "master_id")
    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hyujia hyujia = (Hyujia) o;

        if (id != hyujia.id) return false;
        if (mId != null ? !mId.equals(hyujia.mId) : hyujia.mId != null) return false;
        if (address != null ? !address.equals(hyujia.address) : hyujia.address != null) return false;
        if (type != null ? !type.equals(hyujia.type) : hyujia.type != null) return false;
        if (himages != null ? !himages.equals(hyujia.himages) : hyujia.himages != null) return false;
        if (hname != null ? !hname.equals(hyujia.hname) : hyujia.hname != null) return false;
        if (state != null ? !state.equals(hyujia.state) : hyujia.state != null) return false;
        if (ztime != null ? !ztime.equals(hyujia.ztime) : hyujia.ztime != null) return false;
        if (dtime != null ? !dtime.equals(hyujia.dtime) : hyujia.dtime != null) return false;
        if (masterId != null ? !masterId.equals(hyujia.masterId) : hyujia.masterId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mId != null ? mId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (himages != null ? himages.hashCode() : 0);
        result = 31 * result + (hname != null ? hname.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (ztime != null ? ztime.hashCode() : 0);
        result = 31 * result + (dtime != null ? dtime.hashCode() : 0);
        result = 31 * result + (masterId != null ? masterId.hashCode() : 0);
        return result;
    }
}
