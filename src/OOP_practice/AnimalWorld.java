package OOP_practice;

public class AnimalWorld {

    public static void main(String[] args) {

        Animal ani = new Animal("Dog", 4, 22) {
            @Override
            public void move() {

            }
        };
        ani.specification();
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
    }
}
