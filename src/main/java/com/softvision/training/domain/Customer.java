package com.softvision.training.domain;

import javax.persistence.*;

@Entity /**Here we define tha the class can be map to a table **/
@Table(name="CUSTOMER") /**It's optional and is sed to define a table name **/
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String sport;

    @Column
    private String phone;

    @Column
    private int personalIdNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPersonalIdNumber() {
        return personalIdNumber;
    }

    public void setPersonalIdNumber(int personalIdNumber) {
        this.personalIdNumber = personalIdNumber;
    }
}
