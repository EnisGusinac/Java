package LearningSamples.passingDataTypes;

/**
 *  Object Car
 */
public class Car {

        private int speed = 230;
        private String brand = "Mercedes";
        private String engine = "V12";

    public Car(int speed, String brand, String engine) {
        this.speed = speed;
        this.brand = brand;
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    // This is the only way Java will run our program
    public static void main(String[] args) {
        String s = "Hello here is ";
        s += " the Car Object!";
        System.out.println(s);
    }

}

