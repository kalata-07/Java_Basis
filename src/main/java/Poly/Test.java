package Poly;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        DeveloperEmp dev1 = new DeveloperEmp("Devcho", "01.01.2020", 4564.0, "IT", "Java");
        System.out.println(dev1.getDepartment());
        System.out.println(dev1.getName());
        System.out.println(dev1.getSalary(Roles.Office_Manager));
        System.out.println(dev1.getSalary(Roles.Accountant));
        System.out.println(dev1.getStartDate());
        System.out.println(dev1.getProgramingLanguage());

        QAEmp qaEmp = new QAEmp("fve", "02.04.1999", 7524.0, "QA", true);

        dev1.feelInPresentSheets();
        qaEmp.feelInPresentSheets();

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(dev1);
        employees.add(qaEmp);
    }
}
