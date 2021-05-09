package com.lrz.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
/* "name" indicates to the table name in the database */
@Table(name = "manager")

public class Manager {
    /* Primary Key */
    @Id
    /* AUTO_INCREMENT */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private Integer managerId;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone_number")
    private Integer telephoneNumber;

    @Column(name = "password")
    private String password;

    @Column(name = "authority")
    private Integer authority;

    @Column(name = "avatar")
    private String avatar;

    /* Function */
    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setTelephoneNumber(Integer telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Integer getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", password='" + password + '\'' +
                ", authority=" + authority +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
