package com.qy.domain;

import javax.persistence.*;

@Entity
@Table(name = "username",schema = "yueke")
public class Username {
    private int id;
    private String username;
    private String pwd;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Username username1 = (Username) o;

        if (id != username1.id) return false;
        if (username != null ? !username.equals(username1.username) : username1.username != null) return false;
        if (pwd != null ? !pwd.equals(username1.pwd) : username1.pwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        return result;
    }
}
