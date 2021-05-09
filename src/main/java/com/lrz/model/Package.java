package com.lrz.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
/* "name" indicates to the table name in the database */
@Table(name = "package")

public class Package {
    /* Primary Key */
    @Id
    /* AUTO_INCREMENT */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "package_id")
    private Integer packageId;

    @Column(name = "driver_id")
    private Integer driverId;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "state")
    private Integer state;

    @Column(name = "send_date")
    private String sendDate;

    @Column(name = "receive_date")
    private String receiveDate;

    @Column(name = "departure")
    private String departure;

    @Column(name = "destination")
    private String destination;

    /* Foreign Keys *
    /* Relationship is maintained by "Many" *
    @ManyToOne()
    /* name indicates the foreign key in this table.
       referencedColumnName indicates the primary key in the mapped table *
    @JoinColumn(name = "driverId", referencedColumnName = "driverId")
    private Driver driverId;
    */

    /* Function */

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageId=" + packageId +
                ", driverId=" + driverId +
                ", vendorName=" + vendorName +
                ", state=" + state +
                ", sendDate='" + sendDate + '\'' +
                ", receiveDate='" + receiveDate + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

}
