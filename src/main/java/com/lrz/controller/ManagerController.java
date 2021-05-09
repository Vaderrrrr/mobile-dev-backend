package com.lrz.controller;

import com.lrz.model.Manager;
import com.lrz.services.ManagerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ManagerController {

    @Autowired
    private ManagerServices managerServices;

    /* Test for Connection */
    @GetMapping(value = "/manager")
    public String manager(){
        return managerServices.manager();
    }

    /* Create New Manager */
    @GetMapping(value = "/createManager")
    public String createManager(Manager manager) {
        managerServices.managerCreate(manager);
        return "Manager successfully created " + manager;
    }

    /* Delete Manager by Id */
    @GetMapping(value = "/deleteManager")
    public String deleteManager(Integer managerId) {
        managerServices.managerDelete(managerId);
        return "Manager successfully deleted";
    }

    /* Select Manager by Id --------------------无效函数*/
    @GetMapping(value = "/selectManager")
    public String selectManagerId(Manager manager) {
        Manager managerDisplay = managerServices.managerSelectId(manager);
        return "Manager successfully selected by id " + managerDisplay;
    }

    /* Select All Manager */
    @GetMapping(value = "/selectManagerAll")
    public List<Manager> selectManagerAll() {
        return managerServices.managerSelectAll();
    }

    /* Update Manager Information */
    @GetMapping(value = "/updateManager")
    public String updateManager(Manager manager) {
        managerServices.managerUpdate(manager);
        return "Manager information successfully updated: " + manager;
    }

    /* Update Manager for Password */
    @GetMapping(value = "/updateManagerPassword")
    public String updateManagerPassword(Manager manager) {
        managerServices.managerUpdatePassword(manager);
        return "Manager password successfully updated " + manager.getPassword();
    }

    /* Update Manager for Name *
    @PostMapping(value = "/updateManagerName")
    public String updateManagerName(@RequestBody Manager manager) {
        managerServices.managerUpdateName(manager);
        return "Manager name successfully updated " + manager.getManagerName();
    }

    /* Update Manager for Email *
    @PostMapping(value = "/updateManagerEmail")
    public String updateManagerEmail(@RequestBody Manager manager) {
        managerServices.managerUpdateEmail(manager);
        return "Manager email successfully updated " + manager.getEmail();
    }

    /* Update Manager for Telephone Number *
    @PostMapping(value = "/updateManagerTel")
    public String updateManagerTel(@RequestBody Manager manager) {
        managerServices.managerUpdateTel(manager);
        return "Manager telephone number successfully updated " + manager.getTelephoneNumber();
    }
    */
    /* Select Manager by Name --------------------无效函数
    @GetMapping(value = "/selectManagerName")
    public String selectManagerName(@RequestBody Manager manager) {
        Manager managerDisplay = managerServices.managerSelectName(manager);
        return "Manager successfully selected by name " + managerDisplay;
    }
    */
}
