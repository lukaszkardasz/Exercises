package exercises.org.converter;

public class MetricConverter {


    double mToCm(double m) {
        return m * 100;
    }

    double mToMm(double m) {
        return m * 1_000;
    }

    double cmToM(double cm) {
        return cm / 100;
    }

    double mmToM(double mm) {
        return mm / 1000;
    }

}
