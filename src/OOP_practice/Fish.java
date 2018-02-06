package OOP_practice;

/**
 * Animal is the parent class of the Fish child class
 * Fish is inheriting the Animal behaviour functionality
 */
public class Fish extends Animal {

    public Fish(String specie, int age, int weightInLbs) {
        super(specie, age, weightInLbs);
    }

    @Override
    public void move() {

    }

    public void swim() {
        System.out.println("Fish can swim... ");
    }

}
