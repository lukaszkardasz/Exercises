package exercises.org.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatePatternTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tworzę nowe wydarzenie.");
        System.out.println("Podaj datę i godzinę w formacie dd-MM-yyyy HH:mm");

        DateTimeFormatter dateTimePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dateTimeInput = sc.nextLine();
        LocalDateTime createdDateTime = LocalDateTime.parse(dateTimeInput, dateTimePattern);
        System.out.println("Wydarzenie utworzone na dzień " + createdDateTime);
    }
}
