import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *   JavaBeans Pattern - allows inconsistency, mandates mutability
 *   in which you call a parameterless constructor to create
 *   the object and then call setter methods to set each
 *   required parameter and each optional parameter
 *   of interest
 */
public class Company {

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

    public Date time() {
        Calendar gtm = Calendar.getInstance(TimeZone.getTimeZone("GTM"));
        gtm.set(2000, Calendar.JANUARY, 1,1, 11, 33);

                Date start = gtm.getTime();
        System.out.print(start);

        return start;
    }

}
