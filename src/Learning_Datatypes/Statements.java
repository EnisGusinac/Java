package Learning_Datatypes;

public class Statements {
    public static void main(String[] args) {

        int x = 1;
        int y = -5;

        // Basic IF statements
        for (int i = 0; i <= 5; i++) {
            System.out.println("Counting = " + i);
        }
        // practicing while loop
        while (y <= 0) {
            System.out.println("Y is " + y);
            y++;
        }

        // Basic If/Else statements
        if (x > 0 & y > 0) {
            System.out.println("Both are positive");
        } else if (x > 0 || y > 0) {
            System.out.println("One is positive");
        } else {
            System.out.println("Both are negative");
        }

        // Basic switch statement
        int j = 2;
        switch (j) {
            case 1:
                System.out.println("Value is one");
                break;
            case 2:
                System.out.println("Value is two");
                break;
            default:
                System.out.println("No value presented");
                break;
        }

        // Basic array
        int[] a = {10, 20, 30, 40, 50};
        System.out.println("Array positions: a1=" + a[0] + " a2=" + a[1] + " a3=" + a[2] + " a4=" + a[3] + "... ");

        /**
         *  Enhanced for loop, used in play framework
         */
        for (int temp : a) {
            System.out.println(temp);
        }

        //Multidimensional arrays
        int[][] twoDimensionalArray = new int[4][3];
        // assigning value in MultiDimArray
        twoDimensionalArray[2][1] = 10;


        /**
         *  Parsing the values
         */
        String age = "30";
        String salary = "1000";

        // Wrapper classes
        int EmployeeAge = Integer.parseInt(age);
        System.out.println("Salary is: " + EmployeeAge);

        double EmployeeSalary = Double.parseDouble(salary) - 150;
        System.out.println("Salary is: " + EmployeeSalary);


    }
}
