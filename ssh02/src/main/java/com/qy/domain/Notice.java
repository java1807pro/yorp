package com.qy.domain;

import javax.persistence.*;

@Entity
@Table(name = "notice",schema = "yueke")
public class Notice {
    private int id;
    private String value;
    private Integer hId;
    private String time;
    private Integer state;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "h_id")
    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
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
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notice notice = (Notice) o;

        if (id != notice.id) return false;
        if (value != null ? !value.equals(notice.value) : notice.value != null) return false;
        if (hId != null ? !hId.equals(notice.hId) : notice.hId != null) return false;
        if (time != null ? !time.equals(notice.time) : notice.time != null) return false;
        if (state != null ? !state.equals(notice.state) : notice.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (hId != null ? hId.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
