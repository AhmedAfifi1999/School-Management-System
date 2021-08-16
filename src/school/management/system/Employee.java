
package school.management.system;

import java.io.Serializable;

public abstract class Employee implements Serializable {

    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private double basicSalary;
    private double liveExpensive;

    public Employee() {
    }

    public Employee(int id, String name, String address, String phoneNumber, String email, double basicSalary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getLiveExpensive() {
        return getBasicSalary()* .1;
    }

    public void setLiveExpensive(double liveExpensive) {
        this.liveExpensive = liveExpensive;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return "Id : " + getId() + " , Name : " + getName() + " , Address : " + getAddress() + " , Salary : " + getBasicSalary()
                + " , Email : " + getEmail() + " , PhoneNumber : " + getPhoneNumber() + " , LiveExpensive : " + getLiveExpensive();
    }

}
