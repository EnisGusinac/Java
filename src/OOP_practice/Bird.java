package OOP_practice;

public class Bird extends Animal {

    public Bird(String specie, int age, int weightInLbs) {
        super(specie, age, weightInLbs);
    }

    public void fly() {
        System.out.println("Bird is flying...");
    }

}
