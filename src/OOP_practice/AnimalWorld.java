package OOP_practice;

public class AnimalWorld {

    public static void main(String[] args) {

        Animal ani = new Animal("Dog", 4, 22);
        ani.specification();
        System.out.println("______________________");

        Bird birdy = new Bird("Birdy", 1, 3);
        birdy.fly();
        birdy.specification();
        System.out.println("______________________");

        Fish fish = new Fish("Shark", 4, 1202);
        fish.swim();
        fish.specification();
        System.out.println("______________________");


    }
}
