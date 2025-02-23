package Poly;

public class DeveloperEmp extends Employee{
    private String programingLanguage;

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }

    public DeveloperEmp(String name, String startDate, double salary, String department, String programingLanguage) {
        super(name, startDate, salary, department);
        setProgramingLanguage(programingLanguage);
    }
    public void WriteCode(){
        System.out.println(this + " is writing code...");
    }

    @Override
    protected void CalculateBonus() {

    }

    @Override
    public void supportSomeone() {
        System.out.println("Read the code provided");
    }

    @Override
    public String giveFeedback() {
        String result = "the code is good";
        System.out.println(result);
        return result;
    }

    @Override
    public void feelInPresentSheets() {
        System.out.println("DevManager: Fill in data");
    }
}
