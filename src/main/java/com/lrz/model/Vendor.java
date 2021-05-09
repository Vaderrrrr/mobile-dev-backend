package com.lrz.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
/* "name" indicates to the table name in the database */
@Table(name = "vendor")

public class Vendor {
    /* Primary Key */
    @Id
    /* AUTO_INCREMENT */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vendor_id")
    private Integer vendorId;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone_number")
    private Integer telephoneNumber;

    @Column(name = "address")
    private String address;

    /* Function */
    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(Integer telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorId=" + vendorId +
                ", vendorName='" + vendorName + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

}
