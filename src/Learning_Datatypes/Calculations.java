package Learning_Datatypes;

public class Calculations {
    public static void main(String[] args) {
        double salary = 4000.00;
        double tax = 0.0;

        if (salary < 2000.00) {
            System.out.println("Tax for low salary is " + salary * .10);
        } else if (salary > 2000.00 && salary < 5000.00) {
            System.out.println("Tax for middle salary is " + salary * .30);
        } else if (salary > 5000.00 && salary < 10000.00) {
            System.out.println("Tax for big salary is " + salary * .50);
        } else {

        }

    }
}
