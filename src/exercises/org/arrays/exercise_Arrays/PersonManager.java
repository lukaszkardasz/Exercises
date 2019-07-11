package exercises.org.arrays.exercise_Arrays;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class PersonManager {
    public static void main(String[] args) {

        PersonDatabase pdb = new PersonDatabase();
        pdb.add(new Person("Ania", "Bunkier", "123123123"));
        pdb.add(new Person("Debra", "Stasia", "823645643"));
        pdb.add(new Person("Arielka", "Kruk", "523923100"));

        System.out.println(pdb);

        pdb.remove(new Person("Debra", "Stasia", "823645643"));
        System.out.println();
        pdb.size();
        System.out.println(pdb);
    }
}
