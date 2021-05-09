package com.lrz.dao;

import com.lrz.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverDao extends JpaRepository <Driver, Integer> {
    Driver getByDriverName(String driverName);
}
