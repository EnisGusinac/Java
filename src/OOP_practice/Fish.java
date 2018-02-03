package OOP_practice;

public class Fish extends Animal {

    public Fish(String specie, int age, int weightInLbs) {
        super(specie, age, weightInLbs);
    }

    public void swim() {
        System.out.println("Fish can swim... ");
    }

}
