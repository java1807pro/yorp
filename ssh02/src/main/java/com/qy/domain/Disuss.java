package com.qy.domain;

import javax.persistence.*;

@Entity
@Table(name = "disuss",schema = "yueke")
public class Disuss {
    private int id;
    private Integer tId;
    private Integer uId;
    private String value;
    private String time;
    private Integer lv;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "t_id")
    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    @Basic
    @Column(name = "u_id")
    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "lv")
    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Disuss disuss = (Disuss) o;

        if (id != disuss.id) return false;
        if (tId != null ? !tId.equals(disuss.tId) : disuss.tId != null) return false;
        if (uId != null ? !uId.equals(disuss.uId) : disuss.uId != null) return false;
        if (value != null ? !value.equals(disuss.value) : disuss.value != null) return false;
        if (time != null ? !time.equals(disuss.time) : disuss.time != null) return false;
        if (lv != null ? !lv.equals(disuss.lv) : disuss.lv != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tId != null ? tId.hashCode() : 0);
        result = 31 * result + (uId != null ? uId.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (lv != null ? lv.hashCode() : 0);
        return result;
    }
}
