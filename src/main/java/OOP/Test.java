package OOP;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Address dogAddress = new Address();
        dogAddress.setCity("Smolyan");
        dogAddress.setStreetName("Maritsa");
        dogAddress.setPostalCode(4018);
        dog1.setAge(2);
        dog1.setBreed(new Breed("French bulldog"));
        dog1.setHasTail(false);
        dog1.setName("Lucky");
        dog1.setAddress(dogAddress.Info());
        dog1.PrintData();

        dog1.Jump();
        dog1.Run();
    }
}
