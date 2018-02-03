package OOP_practice;

public class Sparrow extends Bird implements BirdInterface {
    // implementing the Bird constructor
    public Sparrow(String specie, int age, int weightInLbs) {
        super(specie, age, weightInLbs);
    }

    @Override
    public void flyable() {
        System.out.println(specie + " is flying high");
    }
}
