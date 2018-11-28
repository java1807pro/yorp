package com.qy.domain;

import javax.persistence.*;

@Entity
@Table(name = "corsourl",schema = "yueke")
public class Corsourl {
    private int id;
    private String images;
    private String sort;
    private String time;
    private Integer hId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "images")
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Basic
    @Column(name = "sort")
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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
    @Column(name = "h_id")
    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Corsourl corsourl = (Corsourl) o;

        if (id != corsourl.id) return false;
        if (images != null ? !images.equals(corsourl.images) : corsourl.images != null) return false;
        if (sort != null ? !sort.equals(corsourl.sort) : corsourl.sort != null) return false;
        if (time != null ? !time.equals(corsourl.time) : corsourl.time != null) return false;
        if (hId != null ? !hId.equals(corsourl.hId) : corsourl.hId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (images != null ? images.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (hId != null ? hId.hashCode() : 0);
        return result;
    }
}
