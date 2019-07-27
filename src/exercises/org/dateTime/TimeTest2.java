package exercises.org.dateTime;

import java.time.LocalTime;

public class TimeTest2 {
    public static void main(String[] args) throws InterruptedException {
        LocalTime now = LocalTime.now();

        final int COUNT = 10;
        for (int i = 0; i < COUNT; i++) {
            System.out.println(now);
            now = now.plusSeconds(COUNT/10);
            Thread.sleep(1000 * (COUNT / 10));
        }
    }
}
