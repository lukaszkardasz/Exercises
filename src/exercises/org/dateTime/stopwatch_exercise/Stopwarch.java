package exercises.org.dateTime.stopwatch_exercise;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stopwarch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wciśnij enter aby rozpocząć pomiar czasu.");

        sc.nextLine();
        Instant i1 = Instant.now();
        System.out.println("Naciśnij enter aby zatrzymać.");
        sc.nextLine();
        Instant i2 = Instant.now();
        Duration duration = Duration.between(i1, i2);
        System.out.println("Zmierzony czas: " + duration.getSeconds() + "sec, " + duration.toMillis() + "msec");
    }
}
