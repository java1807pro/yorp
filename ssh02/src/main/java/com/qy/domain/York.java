package com.qy.domain;

import javax.persistence.*;

@Entity
@Table(name = "york",schema = "yueke")
public class York {
    private int id;
    private Integer courseId;
    private Integer state;
    private Integer tId;
    private Integer hId;
    private Integer vId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
    @Column(name = "h_id")
    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    @Basic
    @Column(name = "v_id")
    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        York york = (York) o;

        if (id != york.id) return false;
        if (courseId != null ? !courseId.equals(york.courseId) : york.courseId != null) return false;
        if (state != null ? !state.equals(york.state) : york.state != null) return false;
        if (tId != null ? !tId.equals(york.tId) : york.tId != null) return false;
        if (hId != null ? !hId.equals(york.hId) : york.hId != null) return false;
        if (vId != null ? !vId.equals(york.vId) : york.vId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (tId != null ? tId.hashCode() : 0);
        result = 31 * result + (hId != null ? hId.hashCode() : 0);
        result = 31 * result + (vId != null ? vId.hashCode() : 0);
        return result;
    }
}
