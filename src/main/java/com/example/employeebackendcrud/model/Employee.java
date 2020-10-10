package com.example.employeebackendcrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue
    public Integer id;
    public String name;
    public String designation;
    public String phone;

    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void  setDesignation(String designation)
    {
        this.designation = designation;
    }
    public String getDesignation()
    {
        return this.designation;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public String getPhone()
    {
        return this.phone;
    }
}
