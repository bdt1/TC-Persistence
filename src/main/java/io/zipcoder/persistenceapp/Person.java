package io.zipcoder.persistenceapp;


import java.sql.Date;

/**
 * Created by O581051 on 8/31/2017.
 */
public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String mobile;
    private Date birthday;

    public Person(int id, String firstName, String lastName, String mobile, Date birthday) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.birthday = birthday;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}


