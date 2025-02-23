package OOP;

public class Parrot extends Pet {
    public void Talks() {
        System.out.println("I can talk");
    }

    public boolean IsExpensive(Breed breed) {
        boolean result;
        switch (breed.getBreedName()) {
            case "Ara":
                result=true;
                break;
            case "Mini":
                result=false;
                break;
            default:
                result=false;
        }
        return result;
    }
}