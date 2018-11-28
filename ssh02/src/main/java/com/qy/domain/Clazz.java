package com.qy.domain;

import javax.persistence.*;

@Entity
@Table(name = "class", schema = "yueke")
public class Clazz {
    private int id;
    private Integer max;
    private Integer hId;
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
    @Column(name = "max")
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
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

        Clazz clazz = (Clazz) o;

        if (id != clazz.id) return false;
        if (max != null ? !max.equals(clazz.max) : clazz.max != null) return false;
        if (hId != null ? !hId.equals(clazz.hId) : clazz.hId != null) return false;
        if (name != null ? !name.equals(clazz.name) : clazz.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (max != null ? max.hashCode() : 0);
        result = 31 * result + (hId != null ? hId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
