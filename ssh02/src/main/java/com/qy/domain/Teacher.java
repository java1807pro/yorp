package com.qy.domain;

import javax.persistence.*;

@Entity
@Table(name = "teacher",schema = "yueke")
public class Teacher {
    private int id;
    private String tp;
    private Integer hId;
    private String tPhone;
    private String sex;
    private String name;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tp")
    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
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
    @Column(name = "t_phone")
    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (id != teacher.id) return false;
        if (tp != null ? !tp.equals(teacher.tp) : teacher.tp != null) return false;
        if (hId != null ? !hId.equals(teacher.hId) : teacher.hId != null) return false;
        if (tPhone != null ? !tPhone.equals(teacher.tPhone) : teacher.tPhone != null) return false;
        if (sex != null ? !sex.equals(teacher.sex) : teacher.sex != null) return false;
        if (name != null ? !name.equals(teacher.name) : teacher.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tp != null ? tp.hashCode() : 0);
        result = 31 * result + (hId != null ? hId.hashCode() : 0);
        result = 31 * result + (tPhone != null ? tPhone.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
