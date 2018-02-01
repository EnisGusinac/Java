import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Person  {
    private static final Date birthDate = null;

    private static final Date Boom_Start;
    private static final Date Boom_end;

    static {
        Calendar gtmCal = Calendar.getInstance(TimeZone.getTimeZone("GTM"));
        gtmCal.set(2000, Calendar.JANUARY, 1, 1, 11, 12);

        Boom_Start = gtmCal.getTime();

        gtmCal.set(2001, 12, 12, 21, 22, 31);

        Boom_end = gtmCal.getTime();
    }

    public boolean isDateEq() {
        return birthDate.compareTo(Boom_Start) >= 0 && birthDate.compareTo(Boom_end) < 0;
    }

    static Scanner userInput = new Scanner(System.in);

}
