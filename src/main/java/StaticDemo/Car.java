package StaticDemo;

public class Car extends DriveCar{
    private String color;
    private static int counter;
    private static String engineType;
    private final static boolean FOUR_WHEEL=true;
    private final String brandName;

    static {
        System.out.println("Initializing engine type");
        engineType="Gasoline";
        //FOUR_WHEEL=true;
    }

    public static int getCounter() {
        return counter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String color, String brandName){
        setColor(color);
        this.brandName=brandName;
        counter++;
    }

    public final void PrintCarDetails(){
        System.out.println("Car details:");
        System.out.println("Car color "+color);
        System.out.println("Car brand "+brandName);
        System.out.println("Car engine type "+engineType);
        System.out.println("Car 4 wheel drive system "+FOUR_WHEEL);
    }

    @Override
    public void driveForward(String carIdentifier) {
        System.out.println(carIdentifier + " is going forward");
    }

    @Override
    public String driveBackward(String carIdentifier) {
        String result = carIdentifier + " is going backward";
        System.out.println(result);
        return result;
    }
}
