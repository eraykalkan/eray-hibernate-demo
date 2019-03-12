package com.eray.hibernate.erayhibernatedemo.dao;

import com.eray.hibernate.erayhibernatedemo.entity.Okul;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OkulDAO extends CrudRepository<Okul, Long> {
}
