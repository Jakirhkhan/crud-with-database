package com.practice.dbcrud.tax.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
@Entity
@Table(name = "taxes")
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int tin;

    @Column(name = "sur_name", length = 30)
    private String surname;

    @NotBlank(message = "Name is mandatory")
    @NotNull
    @Column(name = "first_name", length = 100)
    private String firstName;
    private String lastName;

    private Long nid;
    private Date dob;

    public Tax() {
    }

    public Tax(Long id, int tin, String surname, String firstName, String lastName, Long nid, Date dob) {
        this.id = id;
        this.tin = tin;
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nid = nid;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTin() {
        return tin;
    }

    public void setTin(int tin) {
        this.tin = tin;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getNid() {
        return nid;
    }

    public void setNid(Long nid) {
        this.nid = nid;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
