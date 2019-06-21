package Exercises.exceptions.schoolExercise;


/**
 * @author n2god on 20/06/2019
 * @project Exercises
 */
public class School {
    private Student[] students;
    public int studentsNumber = 0;

    public School(int studentsNumber) {
        students = new Student[studentsNumber];
    }


    public void add(Student student) throws StudentMaxNumberException {
        if (studentsNumber >= students.length) {
            throw new StudentMaxNumberException("Brak miejsca w szkole: " + students.length);
        } else {
            students[studentsNumber] = student;
            studentsNumber++;
        }
    }

    public Student find(String name, String surname) throws ElementNotFoundException {
        boolean found = false;
        int index = 0;
        while (!found && studentsNumber < students.length) {

            if (students[index].getName().equals(name) && students[index].getSurname().equals(surname)) {
                return students[index];
            } else {
                index++;
            }
        }
        throw new ElementNotFoundException("Nie znaleziono studenta o imieniu: " + name + " " + surname);
    }
}

