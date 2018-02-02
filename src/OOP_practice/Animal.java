package OOP_practice;

public class Animal {
    String specie;
    int age;
    int weightInLbs;

    public Animal(String specie, int age, int weightInLbs) {
        this.specie = specie;
        this.age = age;
        this.weightInLbs = weightInLbs;
    }

    public void fly() {
        System.out.println( specie + " is flying");
    }

    public void bark() {
        System.out.println( specie + " is barking");
    }

    public void specification() {
        System.out.println(specie + " is " + age + "y and have " + weightInLbs + " lbs");
    }


}
