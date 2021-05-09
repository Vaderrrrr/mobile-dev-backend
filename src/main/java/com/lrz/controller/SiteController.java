package com.lrz.controller;

import com.lrz.model.Site;
import com.lrz.services.SiteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SiteController {

    @Autowired
    private SiteServices siteServices;

    /* Test for Connection */
    @GetMapping(value = "/site")
    public String site(){
        return siteServices.site();
    }

    /* Create New Site */
    @GetMapping(value = "/createSite")
    public String createSite(Site site) {
        siteServices.siteCreate(site);
        return "Site successfully created: " + site;
    }

    /* Delete Site by Id */
    @GetMapping(value = "/deleteSite")
    public String deleteSite(Integer siteId) {
        siteServices.siteDelete(siteId);
        return "Site successfully deleted";
    }

    /* Select Site by Id */
    @GetMapping(value = "/selectSiteId")
    public String selectSiteId(Integer siteId) {
        Site siteDisplay = siteServices.siteSelectId(siteId);
        return "Site successfully selected by id " + siteDisplay;
    }

    /* Select All Site*/
    @GetMapping(value = "/selectSiteAll")
    public List<Site> selectSiteAll() {
        return siteServices.siteSelectAll();
    }

    /* Update Site Information */
    @GetMapping(value = "/updateSite")
    public String updateSite(Site site) {
        siteServices.siteUpdate(site);
        return "Site information successfully updated: " + site;
    }

    /* Update Site for Name *
    @PostMapping(value = "/updateSiteName")
    public String updateDriverName(@RequestBody Site site) {
        siteServices.siteUpdateName(site);
        return "Site name successfully updated " + site.getSiteName();
    }

    /* Update Site for Password *
    @PostMapping(value = "/updateSitePassword")
    public String updateSitePassword(@RequestBody Site site) {
        siteServices.siteUpdatePassword(site);
        return "Site password successfully updated " + site.getPassword();
    }

    /* Update Site for Email *
    @PostMapping(value = "/updateSiteEmail")
    public String updateSiteEmail(@RequestBody Site site) {
        siteServices.siteUpdateEmail(site);
        return "Site email successfully updated " + site.getEmail();
    }

    /* Update Site for Telephone Number *
    @PostMapping(value = "/updateSiteTel")
    public String updateSiteTel(@RequestBody Site site) {
        siteServices.siteUpdateTel(site);
        return "Site telephone number successfully updated " + site.getTelephoneNumber();
    }

    /* Update Site for Destination
    @PostMapping(value = "/updateSiteDestination")
    public String updateSiteDestination(@RequestBody Site site) {
        siteServices.siteUpdateDestination(site);
        return "Site destination successfully updated " + site.getDestination();
    }
    */
    /* Select Site by Name
    @GetMapping(value = "/selectSiteName")
    public String selectSiteName(@RequestBody Site site) {
        Site siteDisplay = siteServices.siteSelectName(site);
        return "Site successfully selected by name " + siteDisplay;
    }
    */
}
