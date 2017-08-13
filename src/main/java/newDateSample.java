import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class newDateSample {

    public static StringBuilder getSpeDayOfWeek(LocalDateTime currentDate)
    {
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        return new StringBuilder(dayOfWeek.toString());
    }


    public static void main(String[] args) {
        LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);
        DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
        System.out.println(dayOfWeek);      // WEDNESDAY

        System.out.println(getSpeDayOfWeek(sylvester));
    }
}
