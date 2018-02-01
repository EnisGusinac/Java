import java.util.Date;

/**
 *  The form of the Builder pattern
 *  third alternative that combines the safety of the telescoping constructor
 *  pattern with the readability of the JavaBeans pattern
 */
public class CompanyBuilderPattern {

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

    public class Machine {
        private String name;
        private String engine;
        private Integer fuel;
        private Integer parts;

        public Integer startTime;
        public Date productionDate;
        public Integer workingHours;

        // Constructor with all properties - Telescoping constructor pattern
        public Machine(String engine, Integer fuel, Integer parts, Integer startTime, Date productionDate, Integer workingHours) {
            this.engine = engine;
            this.fuel = fuel;
            this.parts = parts;
            this.startTime = startTime;
            this.productionDate = productionDate;
            this.workingHours = workingHours;
        }

    }
}
