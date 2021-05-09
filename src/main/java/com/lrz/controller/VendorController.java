package com.lrz.controller;

import com.lrz.model.Vendor;
import com.lrz.services.VendorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class VendorController {

    @Autowired
    private VendorServices vendorServices;

    /* Test for Connection */
    @GetMapping(value = "/vendor")
    public String vendor(){
        return vendorServices.vendor();
    }

    /* Create New Vendor */
    @GetMapping(value = "/createVendor")
    public String createVendor(Vendor vendor) {
        vendorServices.vendorCreate(vendor);
        return "Vendor successfully created " + vendor;
    }

    /* Delete Vendor by Id */
    @GetMapping(value = "/deleteVendor")
    public String deleteVendor(Integer vendorId) {
        vendorServices.vendorDelete(vendorId);
        return "Vendor successfully deleted";
    }

    /* Select Vendor by Id */
    @GetMapping(value = "/selectVendor")
    public String selectVendor(Integer vendorId) {
        Vendor vendorDisplay = vendorServices.vendorSelectId(vendorId);
        return "Vendor successfully selected by id: " + vendorDisplay;
    }

    /* Select All Vendor */
    @GetMapping(value = "/selectVendorAll")
    public List<Vendor> selectVendorAll(){
        return vendorServices.vendorSelectAll();
    }

    /* Update Vendor information */
    @GetMapping(value = "/updateVendor")
    public String updateVendor(Vendor vendor) {
        vendorServices.updateVendor(vendor);
        return "Vendor successfully updated: " + vendor;
    }

    /* Select Vendor by Departure
    @GetMapping(value = "/selectVendorDeparture")
    public String selectVendorDeparture(Vendor vendor) {
        Vendor vendorDisplay = vendorServices.vendorSelectDeparture(vendor);
        return "Vendor successfully selected by departure: " + vendorDisplay;
    }
    */
    /*
    @GetMapping(value = "/vendor_insert")
    public String insert(){
        return "insert" + vendorServices.vendorInsert();
    }

    @GetMapping(value = "/vendor_save")
    public String save(){
        return "save" + vendorServices.vendorSave();
    }

    @GetMapping(value = "/vendor_select")
    public String select(){
        return "select " + vendorServices.vendorSelect();
    }

    @GetMapping(value = "/vendor_delete")
    public String delete(){
        return "delete " + vendorServices.vendorDelete();
    }

    @PostMapping(value = "/vendor_insert_post")
    public String insert_post(@RequestBody Vendor vendor){
        System.err.println(vendor);
        return "insert_port " + vendorServices.vendorInsert(vendor);
    }
*/
}
