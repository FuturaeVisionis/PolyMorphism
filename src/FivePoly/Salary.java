package FivePoly;

import FourPoly.Banana;

/**
 * Created by ronald on 07/10/16.
 */
public class Salary extends Employee {

    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    @Override
    public void mailCheck() {
        System.out.println("Within mailcheck of salary class ");
        System.out.println("Mailing check to " + getName() + " " + "with salary" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newsalary) {
        if (newsalary >= 0.0) {
            System.out.println(newsalary);
            this.salary = newsalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary;
    }

    public static void main(String[] args) {

        Employee employee = new Salary("Peter", "PrincetornAve", 99, 2500);
        ((Salary) employee).setSalary(8800);
        ((Salary) employee).getSalary();

    }
}
