package com.qy.domain;

import javax.persistence.*;

@Entity
@Table(name = "runying",schema = "yueke")
public class Runying {
    private int id;
    private String back;
    private String name;
    private String role;
    private String dataa;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "back")
    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "dataa")
    public String getDataa() {
        return dataa;
    }

    public void setDataa(String dataa) {
        this.dataa = dataa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Runying runying = (Runying) o;

        if (id != runying.id) return false;
        if (back != null ? !back.equals(runying.back) : runying.back != null) return false;
        if (name != null ? !name.equals(runying.name) : runying.name != null) return false;
        if (role != null ? !role.equals(runying.role) : runying.role != null) return false;
        if (dataa != null ? !dataa.equals(runying.dataa) : runying.dataa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (back != null ? back.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (dataa != null ? dataa.hashCode() : 0);
        return result;
    }
}
