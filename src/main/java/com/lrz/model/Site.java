package com.lrz.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
/* "name" indicates to the table name in the database */
@Table(name = "site")

public class Site {
    /* Primary Key */
    @Id
    /* AUTO_INCREMENT */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "site_id")
    private Integer siteId;

    @Column(name = "site_name")
    private String siteName;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone_number")
    private Integer telephoneNumber;

    @Column(name = "address")
    private String address;

    /* Function */
    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
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
        return "Site{" +
                "siteId=" + siteId +
                ", siteName='" + siteName + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

}
