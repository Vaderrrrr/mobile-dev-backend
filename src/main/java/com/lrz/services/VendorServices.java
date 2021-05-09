package com.lrz.services;

import com.lrz.dao.VendorDao;
import com.lrz.model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Service
public class VendorServices {

    @Autowired
    private VendorDao vendorDao;

    /* Test for Connection */
    public String vendor() {
        return "Vendor connected!";
    }

    /* Create New Vendor */
    public void vendorCreate(Vendor vendor) {
        vendorDao.save(vendor);
    }

    /* Delete Vendor by Id */
    public void vendorDelete(Integer vendorId) {
        vendorDao.deleteById(vendorId);
    }

    /* Select Vendor by Id */
    public Vendor vendorSelectId(Integer vendorId) {
        return vendorDao.getOne(vendorId);
    }

    /* Select All Vendor */
    public List<Vendor> vendorSelectAll(){
        return vendorDao.findAll();
    }

    /* Update Vendor Information */
    public void updateVendor(Vendor vendor) {
        Vendor vendorNew = vendorDao.getOne(vendor.getVendorId());
        vendorNew.setVendorName(vendor.getVendorName());
        vendorNew.setEmail(vendor.getEmail());
        vendorNew.setTelephoneNumber(vendor.getTelephoneNumber());
        vendorNew.setAddress(vendor.getAddress());
        vendorDao.save(vendorNew);
    }

    /* Select Vendor by Departure *
    public Vendor vendorSelectDeparture(Vendor vendor) {
        return vendorDao.getByDeparture(vendor.getDeparture());
    }

    /* Update Vendor for Departure
    public void vendorUpdateDeparture(Vendor vendor) {
        Vendor vendorOri = vendorDao.getOne(vendor.getVendorId());
        vendorOri.setDeparture(vendor.getDeparture());
        vendorDao.save(vendorOri);
    }
    */
    /*
    public String vendorInsert(){
        Vendor vendor = new Vendor();

        vendor.setDeparture("Ports wood");

        vendorDao.save(vendor);

        return "ok insert " + vendor;
    }

    public Vendor vendorSelect(){
        return vendorDao.getByVendorId(1);
    }

    public Vendor vendorSave(){
        Vendor vendor = vendorDao.getByVendorId(1);
        vendorDao.save(vendor);
        return vendor;
    }

    public String vendorDelete(){
        vendorDao.deleteById(1);

        return "ok";
    }

    public Vendor vendorInsert(Vendor vendor){
        vendorDao.save(vendor);

        return vendor;
    }
*/
}
