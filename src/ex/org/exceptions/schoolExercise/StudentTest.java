package ex.org.exceptions.schoolExercise;

/**
 * @author n2god on 21/06/2019
 * @project org
 */
public class StudentTest {

    public static void main(String[] args) {

        School school = new School(3);
        try {
            school.add(new Student("Jan", "Kowalski", 3));
            school.add(new Student("Janek", "Kowal", 43));
            school.add(new Student("Wiesiek", "Grtyuc", 11));
            school.add(new Student("Wiesiek", "Grtyuc", 12));

        } catch (StudentMaxNumberException e) {
            System.err.println(e.getMessage());
        }
        try {
            school.find("Marek", "Kret");
            school.find("Jan", "Kowalski");
        } catch (ElementNotFoundException e){
            System.err.println(e.getMessage());
        }
    }
}
