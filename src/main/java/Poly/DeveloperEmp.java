package Poly;

public class DeveloperEmp extends Employee{
    public DeveloperEmp(String name, String startDate, double salary, String department) {
        super(name, startDate, salary, department);
    }
    public void WriteCode(){
        System.out.println(this + " is writing code...");
    }
}
