package com.eray.hibernate.erayhibernatedemo.controller;


import com.eray.hibernate.erayhibernatedemo.dao.OkulDAO;
import com.eray.hibernate.erayhibernatedemo.dao.OkulTurDAO;
import com.eray.hibernate.erayhibernatedemo.dao.SinifDuzeyDAO;
import com.eray.hibernate.erayhibernatedemo.entity.Okul;
import com.eray.hibernate.erayhibernatedemo.entity.OkulTur;
import com.eray.hibernate.erayhibernatedemo.entity.SinifDuzey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/test")
public class TestController {

    @Autowired
    private OkulDAO okulDAO;

    @Autowired
    private OkulTurDAO okulTurDAO;

    @Autowired
    private SinifDuzeyDAO sinifDuzeyDAO;

    @GetMapping(value = "/findOkuls")
    public List<Okul> findOkuls() {
        return (List<Okul>) okulDAO.findAll();
    }

    @GetMapping(value = "/findSd")
    public List<SinifDuzey> findSd() {
        return (List<SinifDuzey>) sinifDuzeyDAO.findAll();
    }

    @GetMapping(value = "/findOt")
    public List<OkulTur> findOt() {
        return (List<OkulTur>) okulTurDAO.findAll();
    }

    @PostMapping(value = "/okulKaydet")
    public Okul okulKaydet(@RequestBody Okul okul) {
        return okulDAO.save(okul);
    }

    @PostMapping(value = "/okulTurKaydet")
    public OkulTur okulTurKaydet(@RequestBody OkulTur okulTur) {
        return okulTurDAO.save(okulTur);
    }

    @PostMapping(value = "/sinifDuzeyKaydet")
    public SinifDuzey sinifDuzeyKaydet(@RequestBody SinifDuzey sinifDuzey) {
        return sinifDuzeyDAO.save(sinifDuzey);
    }

}
