package OOP;

public abstract class Pet implements PetActions{
    private boolean hasTail;
    private String name;
    private int age;
    private Breed breed;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;


    }
    public void PrintData(){
        System.out.printf("The pet name is: %s.%nAge: %d.%nBreed: %s.", name,age,breed.getBreedName());
        if (hasTail)
            System.out.println("Has tail");
        else
            System.out.println("Doesn't have tail");
    }

    @Override
    public void Run() {
        System.out.println(name+" is running");
    }

    @Override
    public void Jump() {
        System.out.println(name+" is jumping");
    }



}
