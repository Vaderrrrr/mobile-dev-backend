package com.lrz.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
/* "name" indicates to the table name in the database */
@Table(name = "driver")

public class Driver {
    /* Primary Key */
    @Id
    /* AUTO_INCREMENT */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driver_id")
    private Integer driverId;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone_number")
    private Integer telephoneNumber;

    @Column(name = "password")
    private String password;

    /* Foreign Key to Package */
    /* mappedBy indicates the attribute name of this attribute in the other table *
    @OneToMany(mappedBy = "driverId")
    private Set<Package> packages = new HashSet<>(0);
    */
    /* Function */
    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//
//    public Set<Package> getPackages() {
//        return packages;
//    }
//
//    public void setPackages(Set<Package> packages) {
//        this.packages = packages;
//    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", driverName='" + driverName + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", password='" + password + '\'' +
                '}';
    }
}
