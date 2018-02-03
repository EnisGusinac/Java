package OOP_practice;

/**
 *  Bird class is the child class of the Animal - parent class.
 *  Bird class is inheriting the functionality of the parent class.
 */
public class Bird extends Animal {

    public Bird(String specie, int age, int weightInLbs) {
        super(specie, age, weightInLbs);
    }

    public void fly() {
        System.out.println(specie + " is flying...");
    }

}
