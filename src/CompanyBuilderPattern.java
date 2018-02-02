
/**
 *  The form of the Builder design pattern
 *  third alternative that combines the safety of the telescoping constructor
 *  pattern with the readability of the JavaBeans pattern
 */
public class CompanyBuilderPattern extends Company {

    private int machines = 100;
    private int workers = 1000;
    private int salary = 1000;
    private int expences = -5000;

        public void setMachines(int machines) {
            this.machines = machines;
        }

        public void setWorkers(int workers) {
            this.workers = workers;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void setExpences(int expences) {
            this.expences = expences;
        }

    /**
     *  Usinc static void main - because it is the only way for Java to run the program.
     * @param args
     */
    public static void main(String[] args) {
        // Allocating a new object Company
        Company aba = new Company();
        aba.setExpences(1000);
        aba.setMachines(10);
        aba.setSalary(1000);
        aba.setWorkers(35);
        aba.workingHours();
        System.out.println("____________________________________");

        // Allocating a new object Machine
        Machine newMachine = new Machine();
        newMachine.workingHours = 8;
        newMachine.startTime = 8;
        newMachine.setEngine("Turbo");
        newMachine.setName("Machine");
        newMachine.setStartTime(9);
        newMachine.setFuel(100);
        newMachine.setParts(10);
        newMachine.factoryWork();
        System.out.println("____________________________________");
    }


}
