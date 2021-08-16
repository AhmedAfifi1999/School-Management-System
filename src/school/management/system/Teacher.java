
package school.management.system;

import java.io.Serializable;

public class Teacher extends Employee implements Serializable {

    private int classNumber =0;

    public Teacher() {
    }

   
    public Teacher(int id, String name, String address, String phoneNumber, String email, double basicSalary) {
        super(id, name, address, phoneNumber, email, basicSalary);
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Teacher { " + super.toString() + " , ClassNumber : " + getClassNumber() + " }"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalary() {

        return super.getBasicSalary() + super.getLiveExpensive() +(20*getClassNumber()) ;

    }

}

