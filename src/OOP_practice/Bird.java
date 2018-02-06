package OOP_practice;

/**
 *  Bird class is the child class of the Animal - parent class.
 *  Bird class is inheriting the functionality of the parent class.
 */
public class Bird extends Animal implements BirdInterface{

    public Bird(String specie, int age, int weightInLbs) {
        super(specie, age, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println(specie + " is flapping wings...");
    }

    // Defining the flyable method from Interface
    public void flyable() {
        System.out.println(specie + " is flying...");
    }

}
