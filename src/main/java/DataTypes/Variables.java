package DataTypes;

public class Variables {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Marot");
        dog1.setAge((byte) 1);
        dog1.setBreed("German");
        System.out.println("My dog name and age: "+dog1.getName() + " "+ dog1.getAge());
        System.out.println("Breed: "+ dog1.getBreed());
    }
}
