package com.lrz.dao;

import com.lrz.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao extends JpaRepository<Test, Integer> {

    Test getById(Integer id);

    Test getByName(String name);

}
