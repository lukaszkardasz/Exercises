package Exercises.Converter;


public class Main {

    public static void main(String[] args) {
        MetricConverter metricConverter = new MetricConverter();
        double m = 2.6;
        int hour = 16;
        double cm = metricConverter.mToCm(m);
        double mm = metricConverter.mToMm(m);
        System.out.println(metricConverter.mToCm(m));
        System.out.println(metricConverter.cmToM(cm));
        System.out.println(metricConverter.mToMm(m));
        System.out.println(metricConverter.mmToM(mm));
        System.out.println(m + " to " + cm + "cm i " + mm + "mm");
        TimeConverter timeConverter = new TimeConverter();
        int min = timeConverter.hToMin(hour);
        int sec = timeConverter.minToSec(min);
        System.out.println(hour + " godzin to: " + timeConverter.secToMs(sec) + " ms");
    }

}
