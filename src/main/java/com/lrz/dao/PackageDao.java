package com.lrz.dao;

import com.lrz.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PackageDao extends JpaRepository <Package, Integer> {
    List<Package> getByDriverId(Integer driverId);
}
