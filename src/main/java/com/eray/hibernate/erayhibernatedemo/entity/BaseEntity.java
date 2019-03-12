package com.eray.hibernate.erayhibernatedemo.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private Integer durum;
    private boolean silindi_mi;
    @CreatedDate
    private Instant kayitTarihi= Instant.now();
    @LastModifiedDate
    private Instant guncellenmeTarihi= Instant.now();
    public BaseEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDurum() {
        return durum;
    }

    public void setDurum(Integer durum) {
        this.durum = durum;
    }

    public boolean isSilindi_mi() {
        return silindi_mi;
    }

    public void setSilindi_mi(boolean silindi_mi) {
        this.silindi_mi = silindi_mi;
    }

    public Instant getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Instant kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }

    public Instant getGuncellenmeTarihi() {
        return guncellenmeTarihi;
    }

    public void setGuncellenmeTarihi(Instant guncellenmeTarihi) {
        this.guncellenmeTarihi = guncellenmeTarihi;
    }
}
