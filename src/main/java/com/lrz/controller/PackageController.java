package com.lrz.controller;

import com.lrz.model.Package;
import com.lrz.services.PackageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PackageController {

    @Autowired
    private PackageServices packageServices;

    /* Test for Connection */
    @GetMapping(value = "/packages")
    public String packages(){
        return packageServices.packages();
    }

    /* Create New Package */
    @GetMapping(value = "createPackage")
    public String createPackage(Package packages) {
        packageServices.packageCreate(packages);
        return "Package successfully created " + packages;
    }

    /* Delete Package by Id */
    @GetMapping(value = "/deletePackage")
    public String deletePackage(Integer packageId) {
        packageServices.pacakgeDelete(packageId);
        return "Package successfully deleted";
    }

    /* Select Package by DriverId ----------------------*/
    @GetMapping(value = "/selectPackageByDriverId")
    public List<Package> selectPackageByDriverId(Integer driverId) {
        return packageServices.packageSelectDriverId(driverId);
    }

    /* Select All Package */
    @GetMapping(value = "/selectPackageAll")
    public List<Package> selectPackageAll() {
        return packageServices.packageSelectAll();
    }

    /* Update Package for Send Date and State */
    @GetMapping(value = "/updatePackageSendDate")
    public String updatePackageSendDate(Package packages) {
        packageServices.packageUpdateSendDate(packages);
        return "Package send date successfully updated " + packages;
    }

    /* Update Package for Receive Date and State */
    @GetMapping(value = "/updatePackageReceiveDate")
    public String updatePackageReceiveDate(Package packages) {
        packageServices.packageUpdateReceiveDate(packages);
        return "Package receive date successfully updated" + packages;
    }

    /*
    @GetMapping(value = "/package_insert")
    public String insert(){
        return "insert" + packageServices.packageInsert();
    }

    @GetMapping(value = "/package_save")
    public String save(){
        return "save" + packageServices.packageSave();
    }

    @GetMapping(value = "/package_select")
    public String select(){
        return "select " + packageServices.packageSelect();
    }

    @GetMapping(value = "/package_delete")
    public String delete(){
        return "delete " + packageServices.packageDelete();
    }

    @PostMapping(value = "/package_insert_post")
    public String insert_post(@RequestBody Package packages){
        System.err.println(packages);
        return "insert_port " + packageServices.packageInsert(packages);
    }
*/
}
