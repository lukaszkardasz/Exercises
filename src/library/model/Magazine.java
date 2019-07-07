package library.model;

public class Magazine extends Publication {

    //variables

    public static final String TYPE = "książka";
    private int month;
    private int day;
    private String language;

    //constructors

    public Magazine(int year, int month, int day, String language, String publisher, String title) {
        super(year, title, publisher);
        this.month = month;
        this.day = day;
        this.language = language;
    }

    //getters and setters

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
    }

    //methods

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    @Override
    public String toCsv() {
        return (TYPE + ";") +
                getTitle() + ";" +
                getPublisher() + ";" +
                getYear() + ";" +
                month + ";" +
                day + ";" +
                language + "";
    }

    @Override
    public String toString() {
        return  "title: " + getTitle() +
                ", year: " + getYear() +
                ", month: " + month +
                ", day: " + day +
                ", language: " + language;
    }
}
