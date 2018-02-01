
public class Main {

    public static void main(String[] args){

        String machine = "Tools"; // Literal value of the string
        String machine2 = new String("Parts"); // Allocating a new Object in memory

        switch (machine) {
            case "Tools":
                 System.out.println("Machine tools are here and We're ready to work!");
                 break;

            case "Parts":
                 System.out.println("Machine tools are here and ready to be installed");
                 break;
            case "No tools":
                System.out.println("Machine tools are not here...");
                break;

            default:
                System.out.println("Error " + machine + " is not recognized!");
                break;
        }

    }

}
