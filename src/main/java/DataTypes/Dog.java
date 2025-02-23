package DataTypes;

public class Dog {

        private String name;
        private byte age;
        private static String breed;
public final static String TAIL="short";
        public String getBreed() {
                return breed;
        }

        public void setBreed(String breed) {
                Dog.breed = breed;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public byte getAge() {
                return age;
        }

        public void setAge(byte age) {
                this.age = age;
        }

        public  void Barf(){
        String dogAction="Bau bau";
        System.out.println(dogAction);
}
}
