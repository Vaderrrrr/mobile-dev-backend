package com.lrz.dao;

import com.lrz.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorDao extends JpaRepository <Vendor, Integer> {
    Vendor getByVendorName(String vendorName);
}
