package Poly;

abstract class Employee implements Seniority, Manager{
    private String name;
    private String startDate;
    private double salary;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getSalary(Roles role) {
        if (role.equals(Roles.Accountant))
            return salary;
        else
            return -1;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String name, String startDate, double salary, String department){
        setName(name);
        setDepartment(department);
        setStartDate(startDate);
        setSalary(salary);
    }

    protected abstract void CalculateBonus();

    protected void setBonus(double bonus){
        System.out.println(this.name+" has "+bonus);
        System.out.println("Total is: "+salary+bonus);
    }
}
