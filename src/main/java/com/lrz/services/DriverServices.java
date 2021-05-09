package com.lrz.services;

import com.lrz.dao.DriverDao;
import com.lrz.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Service
public class DriverServices {

    @Autowired
    private DriverDao driverDao;

    /* Test for Connection */
    public String driver() {
        return "Driver connected!";
    }

    /* Driver Login */
    public Integer driverLogin(Driver driver) {
        Driver driverNew = driverDao.getByDriverName(driver.getDriverName());
        if (driverNew == null) {
            return 0;
        } else {
            if (driverNew.getPassword().equals(driver.getPassword())) {
                return 2;
            } else {
                return 1;
            }
        }
    }

    /* Create New Driver */
    public void driverCreate(Driver driver) {
        driver.setPassword("123456");
        driverDao.save(driver);
    }

    /* Delete Driver by Id */
    public void driverDelete(Integer driverId) {
        driverDao.deleteById(driverId);
    }

    /* Select Driver by Id */
    public Driver driverSelectId(Integer driverId) {
        return driverDao.getOne(driverId);
    }

    /* Select All Driver */
    public List<Driver> driverSelectAll() {
        return driverDao.findAll();
    }

    /* Update Driver Information */
    public void driverUpdate(Driver driver) {
        Driver driverNew = driverDao.getOne(driver.getDriverId());
        driverNew.setDriverName(driver.getDriverName());
        driverNew.setEmail(driver.getEmail());
        driverNew.setTelephoneNumber(driver.getTelephoneNumber());
        driverDao.save(driverNew);
    }

    /* Update Driver for Password */
    public boolean driverUpdatePassword(Driver driver) {
        Driver driverNew = driverDao.getOne(driver.getDriverId());
        // If previous password and new password are different
        if (driverNew.getPassword().equals(driver.getPassword())) {
            return false;
        } else {
            // If two passwords are equal
            driverNew.setPassword(driver.getPassword());
            driverDao.save(driverNew);
            return true;
        }
    }

    /* Update Driver for Password
    public void driverUpdatePassword(Driver driver) {
        Driver driverNew = driverDao.getOne(driver.getDriverId());
        driverNew.setPassword(driver.getPassword());
        driverDao.save(driverNew);
    }
    */
    /* Select Driver by Name
    public Driver driverSelectName(Driver driver) {
        return driverDao.getByDriverName(driver.getDriverName());
    }
    */
    /* Update Driver for Name
    public void driverUpdateName(Driver driver) {
        Driver driverOri = driverDao.getOne(driver.getDriverId());
        driverOri.setDriverName(driver.getDriverName());
        driverDao.save(driverOri);
    }
    */
    /* Update Driver for Email *
    public void driverUpdateEmail(Driver driver) {
        Driver driverOri = driverDao.getOne(driver.getDriverId());
        driverOri.setEmail(driver.getEmail());
        driverDao.save(driverOri);
    }

    /* Update Driver for Telephone Number
    public void driverUpdateTel(Driver driver) {
        Driver driverOri = driverDao.getOne(driver.getDriverId());
        driverOri.setTelephoneNumber(driver.getTelephoneNumber());
        driverDao.save(driverOri);
    }
    */
    /*
    public Driver driverInsert(Driver driver) {
        driverDao.save(driver);

        return driver;
    }
    */
}
