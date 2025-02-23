package Poly;

public class QAEmp extends Employee{
    private boolean hasISTQB;

    public boolean isHasISTQB() {
        return hasISTQB;
    }

    public void setHasISTQB(boolean hasISTQB) {
        this.hasISTQB = hasISTQB;
    }

    public QAEmp(String name, String startDate, double salary, String department, boolean hasISTQB) {
        super(name, startDate, salary, department);
        setHasISTQB(hasISTQB);
    }

    public void WritingTests(){
        System.out.println(true+" is writing tests...");
    }

    @Override
    protected void CalculateBonus() {

    }

    @Override
    public void supportSomeone() {
        System.out.println("The test cases look great");
    }

    @Override
    public String giveFeedback() {
        return "This test is finished";
    }

    @Override
    public void feelInPresentSheets() {
        System.out.println("QA Manager: Fill in data");
    }
}
