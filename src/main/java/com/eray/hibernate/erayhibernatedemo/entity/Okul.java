package com.eray.hibernate.erayhibernatedemo.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Okul extends BaseEntity{

    private String okulAdi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="okul_tur_id")
    private OkulTur okulTur;

    @ManyToMany(cascade = {
            CascadeType.DETACH
    })
    @JoinTable(name = "okul_sinifduzey",
            joinColumns = @JoinColumn(name = "okul_id"),
            inverseJoinColumns = @JoinColumn(name = "sinif_duzey_id")
    )
    private Set<SinifDuzey> sinifDuzeyList;

    public Okul() {

    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public OkulTur getOkulTur() {
        return okulTur;
    }

    public void setOkulTur(OkulTur okulTur) {
        this.okulTur = okulTur;
    }

    public Set<SinifDuzey> getSinifDuzeyList() {
        return sinifDuzeyList;
    }

    public void setSinifDuzeyList(Set<SinifDuzey> sinifDuzeyList) {
        this.sinifDuzeyList = sinifDuzeyList;
    }
}
