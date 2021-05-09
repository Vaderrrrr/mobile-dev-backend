package com.lrz.services;

import com.lrz.dao.SiteDao;
import com.lrz.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Service
public class SiteServices {

    @Autowired
    private SiteDao siteDao;

    /* Test for Connection*/
    public String site() {
        return "Site connected!";
    }

    /* Create New Site */
    public void siteCreate(Site site) {
        siteDao.save(site);
    }

    /* Delete Site by Id */
    public void siteDelete(Integer siteId) {
        siteDao.deleteById(siteId);
    }

    /* Select Site by Id */
    public Site siteSelectId(Integer siteId) {
        return siteDao.getOne(siteId);
    }

    /* Select All Site */
    public List<Site> siteSelectAll() {
        return siteDao.findAll();
    }

    /* Update Site Information */
    public void siteUpdate(Site site) {
        Site siteNew = siteDao.getOne(site.getSiteId());
        siteNew.setSiteName(site.getSiteName());
        siteNew.setEmail(site.getEmail());
        siteNew.setTelephoneNumber(site.getTelephoneNumber());
        siteNew.setAddress(site.getAddress());
        siteDao.save(siteNew);
    }

    /* Select Site by Name 错误500-------------------------不行
    public Site siteSelectName(Site site) {
        return siteDao.getBySiteName(site.getSiteName());
    }
    */
    /* Update Site for Name ---------------------------不行*
    public void siteUpdateName(Site driver) {
        Site driverOri = siteDao.getOne(driver.getSiteId());
        driverOri.setSiteName(driver.getSiteName());
        siteDao.save(driverOri);
    }

    /* Update Site for Password *
    public void siteUpdatePassword(Site site) {
        Site siteOri = siteDao.getOne(site.getSiteId());

        siteOri.setPassword(site.getPassword());
        siteDao.save(siteOri);
    }

    /* Update Site for Email *
    public void siteUpdateEmail(Site site) {
        Site siteOri = siteDao.getOne(site.getSiteId());
        siteOri.setEmail(site.getEmail());
        siteDao.save(siteOri);
    }

    /* Update Site for Telephone Number *
    public void siteUpdateTel(Site site) {
        Site siteOri = siteDao.getOne(site.getSiteId());
        siteOri.setTelephoneNumber(site.getTelephoneNumber());
        siteDao.save(siteOri);
    }

    /* Update Site for Destination
    public void siteUpdateDestination(Site site) {
        Site siteOri = siteDao.getOne(site.getSiteId());
        siteOri.setDestination(site.getDestination());
        siteDao.save(siteOri);
    }
    */
}
