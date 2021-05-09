package com.lrz.controller;

import com.lrz.model.Driver;
import com.lrz.services.DriverServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverServices driverServices;

    /* Test for Connection */
    @GetMapping(value = "/driver")
    public String driver(){
        return driverServices.driver();
    }

    /* Login Driver */
    @GetMapping(value = "/loginDriver")
    public Integer loginDriver(Driver driver) {
        return driverServices.driverLogin(driver);
    }

    /* Create New Driver */
    @GetMapping(value = "/createDriver")
    public String createDriver(Driver driver) {
        driverServices.driverCreate(driver);
        return "Driver successfully created " + driver;
    }

    /* Delete Driver by Id */
    @GetMapping(value = "/deleteDriver")
    public String deleteDriver(Integer driverId) {
        driverServices.driverDelete(driverId);
        return "Driver successfully deleted";
    }

    /* Select Driver by Id */
    @GetMapping(value = "/selectDriver")
    public String selectDriver(Integer driverId) {
        Driver driverDisplay = driverServices.driverSelectId(driverId);
        return "Driver successfully selected by id: " + driverDisplay;
    }

    /* Select All Driver */
    @GetMapping(value = "/selectDriverAll")
    public List<Driver> selectDriverAll() {
        return driverServices.driverSelectAll();
    }

    /* Update Driver Information */
    @GetMapping(value = "/updateDriver")
    public String updateDriver(Driver driver) {
        driverServices.driverUpdate(driver);
        return "Driver information successfully updated: " + driver;
    }

    /* Update Driver Password */
    @GetMapping(value = "/updateDriverPassword")
    public boolean updateDriverPassword(Driver driver) {
        return driverServices.driverUpdatePassword(driver);
    }

    /* Update Driver Password
    @GetMapping(value = "/updateDriverPassword")
    public String updateDriverPassword(Driver driver) {
        driverServices.driverUpdatePassword(driver);
        return driver.getPassword();
    }
    */
    /* Select Driver by Name
    @GetMapping(value = "/selectDriverName")
    public String selectDriverName(Driver driver) {
        Driver driverDisplay = driverServices.driverSelectName(driver);
        return "Driver successfully selected by name " + driverDisplay;
    }
    *
    /* Update Driver for Name 改成一次性修改 *
    @GetMapping(value = "/updateDriverName")
    public String updateDriverName(@RequestBody Driver driver) {
        driverServices.driverUpdateName(driver);
        return "Driver name successfully updated " + driver.getDriverName();
    }

    /* Update Driver for Email *
    @GetMapping(value = "/updateDriverEmail")
    public String updateDriverEmail(@RequestBody Driver driver) {
        driverServices.driverUpdateEmail(driver);
        return "Driver email successfully updated " + driver.getEmail();
    }

    /* Update Driver for Telephone Number
    @GetMapping(value = "/updateDriverTel")
    public String updateDriverTel(@RequestBody Driver driver) {
        driverServices.driverUpdateTel(driver);
        return "Driver telephone number successfully updated " + driver.getTelephoneNumber();
    }
    */
    /*
    @GetMapping(value = "/driver_insert")
    public String insert(){
        return "insert" + driverServices.driverInsert();
    }

    @GetMapping(value = "/driver_save")
    public String save(){
        return "save" + driverServices.driverSave();
    }

    @GetMapping(value = "/driver_select")
    public String select(){
        return "select " + driverServices.driverSelect();
    }

    @GetMapping(value = "/driver_delete")
    public String delete(@RequestBody Integer driverId){
        return "delete " + driverServices.driverDelete(driverId);
    }

    @PostMapping(value = "/driver_insert_post")
    public String insert_post(@RequestBody Driver driver){
        System.err.println(driver);
        return "insert_port " + driverServices.driverInsert(driver);
    }
*/
}
