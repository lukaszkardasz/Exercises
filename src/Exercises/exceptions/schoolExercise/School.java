package Exercises.exceptions.schoolExercise;

import Exercises.loops.hospitalExercise.model.Patient;

/**
 * @author n2god on 20/06/2019
 * @project Exercises
 */
public class School {
    private final int MAX_STUDENT_NUMBER = 10;
    Student[] school = new Student[MAX_STUDENT_NUMBER];
    public int students_number = 0;
    public void add(Student student){
        if (students_number < MAX_STUDENT_NUMBER){
            school[students_number] = student;
            students_number++;
        } else {
            throw new StudentMaxNumberException;
    }

    public void find(String name, String surname){

    }
}
