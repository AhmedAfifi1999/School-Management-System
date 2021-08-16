
package school.management.system;

import java.io.Serializable;

public class Principal extends Employee implements Serializable {

    double bonus;

    public Principal() {
    }

    public Principal(double bonus) {
        this.bonus = bonus;
    }

    public Principal(int id, String name, String address, String phoneNumber, String email, double basicSalary, double bonus) {
        super(id, name, address, phoneNumber, email, basicSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Principal { " + super.toString() + " , Bonus : " + getBonus() + " }";
    }

    @Override
    public double getSalary() {
        return super.getBasicSalary() + super.getLiveExpensive() + getBonus();

    }

}
