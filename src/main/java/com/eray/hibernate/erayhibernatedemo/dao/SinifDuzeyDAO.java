package com.eray.hibernate.erayhibernatedemo.dao;

import com.eray.hibernate.erayhibernatedemo.entity.SinifDuzey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinifDuzeyDAO extends CrudRepository<SinifDuzey, Long> {
}
