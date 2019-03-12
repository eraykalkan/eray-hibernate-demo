package com.eray.hibernate.erayhibernatedemo.dao;

import com.eray.hibernate.erayhibernatedemo.entity.OkulTur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OkulTurDAO extends CrudRepository<OkulTur, Long> {
}
