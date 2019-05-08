import java.time.DayOfWeek;

public class Enums {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeeks.TUESDAY));
    }

    public static int getWorkingHours(DayOfWeeks day) {
        return day.getHours();
    }

}
