package OOP_practice;

public class Chicken extends Bird implements BirdInterface {

    // Extending the Bird constructor
    public Chicken(String specie, int age, int weightInLbs) {
        super(specie, age, weightInLbs);
    }

    /**
     * Overriding method - it basically means that we are replacing the
     * method that we are inheriting. Its basically the method that is
     * defined in the Bird class is being inherited in the Chicken
     * and we are redefining that method in the Chicken class
     */
    @Override
    public void flyable() {
        System.out.println(specie + " is not able to fly...");
    }

}
