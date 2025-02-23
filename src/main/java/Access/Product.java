package Access;

public class Product {
    public String publicName;
    protected String protectedName;
    String defaultName;
    private String privateName;

    protected String getPrivateName() {
        return privateName;
    }

     void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public final void makeCalculation(){
CalculatePart2();
CalculationPart1();
    }

    private void CalculationPart1(){

    }
    private void CalculatePart2(){}

    //private Product(){}
}
