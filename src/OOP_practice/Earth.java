package OOP_practice;

public class Earth {

    public static void main(String[] args) {

        // Assigning values to the Human "Tom"
        Human tom = new Human();
        tom.name = "Tom";
        tom.weight = 94;
        tom.eyeColor = "grey";
        tom.height = 187;
        tom.speak();
        tom.walk();
        tom.talk();
        System.out.println("----------------------------------------");

        // Telescoping constructor pattern
        Animal birdy = new Animal("bird", 2, 2);
        birdy.specification();
        birdy.fly();
        System.out.println("----------------------------------------");

        Animal barky = new Animal("dog", 3, 22);
        barky.bark();
        barky.specification();
        System.out.println("----------------------------------------");

    }
}
