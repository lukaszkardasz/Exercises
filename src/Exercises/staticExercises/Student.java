package Exercises.staticExercises;

public class Student {

    private String name;
    private String surName;
    private int indexNumber;
    static int studentsNumber;

    public Student(String name, String surName, int indexNumber) {
        this.name = name;
        this.surName = surName;
        this.indexNumber = indexNumber;
        studentsNumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }
}
