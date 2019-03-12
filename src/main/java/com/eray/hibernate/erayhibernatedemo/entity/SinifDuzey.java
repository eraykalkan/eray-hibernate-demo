package com.eray.hibernate.erayhibernatedemo.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
public class SinifDuzey extends BaseEntity{

    private String sinifDuzeyAdi;

    @ManyToMany(mappedBy = "sinifDuzeyList")
    private Set<OkulTur> okulTurList;

    @ManyToMany(mappedBy = "sinifDuzeyList")
    private Set<Okul> okul;

    public SinifDuzey() {

    }

    public String getSinifDuzeyAdi() {
        return sinifDuzeyAdi;
    }

    public void setSinifDuzeyAdi(String sinifDuzeyAdi) {
        this.sinifDuzeyAdi = sinifDuzeyAdi;
    }

    public Set<OkulTur> getOkulTurList() {
        return okulTurList;
    }

    public void setOkulTurList(Set<OkulTur> okulTurList) {
        this.okulTurList = okulTurList;
    }

    public Set<Okul> getOkul() {
        return okul;
    }

    public void setOkul(Set<Okul> okul) {
        this.okul = okul;
    }
}
