package com.lrz.services;

import com.lrz.dao.PackageDao;
import com.lrz.model.Package;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PackageServices {

    @Autowired
    private PackageDao packageDao;

    /* Test for Connection */
    public String packages() {
        return "Package connected!";
    }

    /* Create New Package */
    public void packageCreate(Package packages) {
        Package packageNew = new Package();
        packageNew.setDriverId(packages.getDriverId());
        packageNew.setVendorName(packages.getVendorName());
        packageNew.setState(0);
        packageNew.setDeparture(packages.getDeparture());
        packageNew.setDestination(packages.getDestination());
        packageDao.save(packageNew);
    }

    /* Delete Package by Id */
    public void pacakgeDelete(Integer packageId) {
        packageDao.deleteById(packageId);
    }

    /* Select Package by DriverId */
    public List<Package> packageSelectDriverId(Integer driverId) {
        return packageDao.getByDriverId(driverId);
    }

    /* Select All Package */
    public List<Package> packageSelectAll() {
        return packageDao.findAll();
    }

    /* Update Package for Send Date and State */
    public void packageUpdateSendDate(Package packages) {
        Package packageNew = packageDao.getOne(packages.getPackageId());
        packageNew.setSendDate(packages.getSendDate());
        packageNew.setState(1);
        packageDao.save(packageNew);
    }

    /* Update Package for Receive Date and State */
    public void packageUpdateReceiveDate(Package packages) {
        Package packageNew = packageDao.getOne(packages.getPackageId());
        packageNew.setReceiveDate(packages.getReceiveDate());
        packageNew.setState(2);
        packageDao.save(packageNew);
    }

    /*
    public void packageCreate(Package packages) {
        packageDao.save(packages);
    }
    */
    /* test
    public void testSave() {
        //创建司机对象
        Driver driver = new Driver();
        driver.setDriverName("TestPackage");
        //创建包裹对象
        Package packages1 = new Package();
        packages1.setDeparture("London");
        Package packages2 = new Package();
        packages2.setDeparture("Bridge");

        //建立关系
        packages1.setDriverId(driver);
        packages2.setDriverId(driver);

        Set<Package> packageSet = new HashSet<>();
        packageSet.add(packages1);
        packageSet.add(packages2);

        //保存
        driverDao.save(driver);
        packageDao.save(packages1);
        packageDao.save(packages2);

    }
    */
    /*
    public String packageInsert(){
        Package packages = new Package();

        packages.setDeparture("London");
        packages.setDestination("Bridge");

        packageDao.save(packages);

        return "ok insert " + packages;
    }

    public Package packageSelect(){
        return packageDao.getByPackageId(1);
    }

    public Package packageSave(){
        Package packages = packageDao.getByPackageId(1);
        packages.setDestination("22222");
        packageDao.save(packages);
        return packages;
    }

    public String packageDelete(){
        packageDao.deleteById(1);

        return "ok";
    }

    public Package packageInsert(Package packages){
        packageDao.save(packages);

        return packages;
    }
*/
}
