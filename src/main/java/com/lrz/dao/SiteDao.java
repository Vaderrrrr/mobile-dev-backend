package com.lrz.dao;

import com.lrz.model.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteDao extends JpaRepository <Site, Integer> {
    Site getBySiteName(String siteName);
}
