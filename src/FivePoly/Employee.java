package FivePoly;

/**
 * Created by ronald on 07/10/16.
 */
public class Employee {

    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an employee.");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public void mailCheck(){
        System.out.println("Mailing a check to:" + this.name + " " + this.address + " " + this.number);
    }
    public String toString(){
        return name +  "  " + address + "  " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }
}
