package OOP_practice;

public class Earth {

    public static void main(String[] args) {

        // Assigning values to the Human named "Tom"
        Human tom = new Human();
        tom.name = "Tom";
        tom.age = 30;
        tom.weight = 94;
        tom.eyeColor = "grey";
        tom.height = 187;
        tom.speak();
        tom.walk();
        tom.talk();
        System.out.println("----------------------------------------");

        // Telescoping constructor design pattern
        Animal birdy = new Animal("bird", 2, 2) {
            @Override
            public void move() {

            }
        };
        birdy.specification();
        System.out.println("----------------------------------------");

        // Telescoping constructor design pattern
        Animal barky = new Animal("dog", 3, 22) {
            @Override
            public void move() {

            }
        };
        barky.specification();
        System.out.println("----------------------------------------");

    }
}
