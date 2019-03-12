package com.eray.hibernate.erayhibernatedemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class OkulTur extends BaseEntity{

    private String okulTurAdi;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    },fetch = FetchType.LAZY)
    @JoinTable(name = "okultur_sinifduzey",
            joinColumns = @JoinColumn(name = "okul_tur_id"),
            inverseJoinColumns = @JoinColumn(name = "sinif_duzey_id")
    )
    private Set<SinifDuzey> sinifDuzeyList;

    public OkulTur() {

    }

    public String getOkulTurAdi() {
        return okulTurAdi;
    }

    public void setOkulTurAdi(String okulTurAdi) {
        this.okulTurAdi = okulTurAdi;
    }

    public Set<SinifDuzey> getSinifDuzeyList() {
        return sinifDuzeyList;
    }

    public void setSinifDuzeyList(Set<SinifDuzey> sinifDuzeyList) {
        this.sinifDuzeyList = sinifDuzeyList;
    }
}
