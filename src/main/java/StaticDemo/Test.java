package StaticDemo;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("red", "Ferrari");
        //car1.color="red";
        //Car.counter=1;

        Car car2 = new Car("blue", "Porsche");
        Car car3 = new Car("pink", "BMW");

        car2.setColor("yellow");

        //car2.color="blue";
        //Car.counter=2;

        //System.out.println(car1.counter);
        //System.out.println(car2.counter);
        //System.out.println(Car.counter);

        System.out.println("All cars manufactured so far are: "+ Car.getCounter());

        car2.PrintCarDetails();

        Tesla modelS = new Tesla("red", "Tesla", "50kw");
        modelS.PrintCarDetails();

        car3.driveForward("car3");
        car2.driveBackward("car2");
    }
}
