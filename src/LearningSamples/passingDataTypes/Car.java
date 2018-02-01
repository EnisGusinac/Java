package LearningSamples.passingDataTypes;

/**
 *  Object Car
 */
public class Car {

        private int speed = 230;
        private String brand = "Mercedes";
        private String engineBrand = "V12";

    public Car(int speed, String brand, String engineBrand){
            this.speed = speed;
            this.brand = brand;
            this.engineBrand = engineBrand;
        }

        public int getSpeed () {
            return speed;
        }

        public void setSpeed ( int speed){
            this.speed = speed;
        }

        public String getBrand () {
            return brand;
        }

        public void setBrand (String brand){
            this.brand = brand;
        }

        // This is the only way Java will run our program
    public static void main(String[] args) {
        String s = "Hello ";
        s += "here is me!";


        System.out.println(s);

    }

}

