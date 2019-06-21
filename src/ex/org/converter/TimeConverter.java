package ex.org.converter;

public class TimeConverter {

    int hToMin(int hour){
        return hour * 60;
    }

    int minToSec(int min){
        return min * 60;
    }

    int secToMs(int sec){
        return  sec * 1_000;
    }

}
