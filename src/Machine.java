import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *   Telescopic constructor pattern
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

    //    empty constructor of noninstatible class
    public Machine() {   }

    //    public static factory method
    private static List<Machine> partsForMashines(Integer machines) {
        return partsForMashines(10);
    }

    List<Machine> machineList = new ArrayList<>();

    public List<Machine> getMachineList() {
        return machineList;
    }

    // Generated Getters
    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public Integer getFuel() {
        return fuel;
    }

    public Integer getParts() {
        return parts;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public Integer getWorkingHours() {
        return workingHours;
    }
}
