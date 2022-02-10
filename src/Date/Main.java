package Date;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       print(9,2,2022);
    }

    public static String print(int day, int month, int year) {
        DayOfWeek today = null;
        if(year > 2000 && year < 3000) {
            LocalDate date = LocalDate.of(year, month, day);
            today = date.getDayOfWeek();

            System.out.println(today);
        }
            return today.toString();

    }
}
