package OOP_practice;

public class AnimalWorld {

    // static method that calls move method
    public static void moveAnimal(Animal animal) {
        animal.move();
    }

    public static void main(String[] args) {

        Animal dog = new Animal("Dog", 4, 22) {
            @Override
            public void move() { System.out.println("This "+ specie + " is moving");}
        };
        dog.specification();
        dog.move();
        System.out.println("______________________");

        Bird birdy = new Bird("Bird", 1, 3);
        birdy.move();
        birdy.flyable();
        birdy.specification();
        System.out.println("______________________");

        Fish fish = new Fish("Shark", 4, 1202);
        fish.swim();
        fish.specification();
        System.out.println("______________________");

        Chicken chicken = new Chicken("Chicken", 1, 8);
        chicken.flyable();
        System.out.println("______________________");

        Sparrow sparrow = new Sparrow("Sparrow", 1, 1);
        sparrow.flyable();
        sparrow.specification();
        System.out.println("______________________");

        // from abstract method
        Animal sparrow1 = new Sparrow("White sparrow", 1, 2);
        sparrow1.move();
        sparrow1.specification();
        System.out.println("______________________");

        moveAnimal(birdy);
        moveAnimal(sparrow);
        moveAnimal(fish);
        moveAnimal(dog);
    }
}
