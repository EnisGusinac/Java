import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Telescopic constructor pattern
 */
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

    // Date format
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();

    // Factory behaviour method
    public void factoryWork() {
        System.out.println("Factory runs at " + startTime + " o'clock every day. The working hours are " + workingHours + " every day + bonus hours occasionally");
        System.out.println("Production date starts at " + dateFormat.format(date) + ", and we have engines type " + engine + " with " + fuel + "l every day, working with full capacity");
    }


    // Parameterless constructor of noninstatible class
    public Machine() {
    }

    // public static factory method
    private static List<Machine> partsForMashines(Integer machines) {
        return partsForMashines(10);
    }

    // Java Beans pattern - Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public void setParts(Integer parts) {
        this.parts = parts;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public void setWorkingHours(Integer workingHours) {
        this.workingHours = workingHours;
    }

}
