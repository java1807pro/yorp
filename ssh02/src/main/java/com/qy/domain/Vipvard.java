package com.qy.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "vipvard",schema = "yueke")
public class Vipvard {
    private int id;
    private Integer state;
    private Integer balance;
    private Integer uId;
    private Integer hId;
    private Integer courseId;
    private Integer price;
    private Date begin;
    private Date end;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "balance")
    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
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
    @Column(name = "h_id")
    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    @Basic
    @Column(name = "course_id")
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "begin")
    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    @Basic
    @Column(name = "end")
    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vipvard vipvard = (Vipvard) o;

        if (id != vipvard.id) return false;
        if (state != null ? !state.equals(vipvard.state) : vipvard.state != null) return false;
        if (balance != null ? !balance.equals(vipvard.balance) : vipvard.balance != null) return false;
        if (uId != null ? !uId.equals(vipvard.uId) : vipvard.uId != null) return false;
        if (hId != null ? !hId.equals(vipvard.hId) : vipvard.hId != null) return false;
        if (courseId != null ? !courseId.equals(vipvard.courseId) : vipvard.courseId != null) return false;
        if (price != null ? !price.equals(vipvard.price) : vipvard.price != null) return false;
        if (begin != null ? !begin.equals(vipvard.begin) : vipvard.begin != null) return false;
        if (end != null ? !end.equals(vipvard.end) : vipvard.end != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (uId != null ? uId.hashCode() : 0);
        result = 31 * result + (hId != null ? hId.hashCode() : 0);
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (begin != null ? begin.hashCode() : 0);
        result = 31 * result + (end != null ? end.hashCode() : 0);
        return result;
    }
}
