package OOP_practice;

public abstract class Animal {
    String specie;
    int age;
    int weightInLbs;

    public Animal(String specie, int age, int weightInLbs) {
        this.specie = specie;
        this.age = age;
        this.weightInLbs = weightInLbs;
    }

    public void specification() {
        System.out.println(specie + " is " + age + "y old and have " + weightInLbs + "lbs in weight");
    }

    public abstract void move();


}
