package exercises.org.dateTime;

import java.time.LocalDate;

public class TimeTest3 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate firstJan = LocalDate.of(2019, 07, 01);

        boolean check = now.isAfter(firstJan);
        System.out.println("Czy " + now + " jest po " + firstJan +"?: " + check);
    }
}
