package exercises.org.files.files_exercises.write.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName =
                "C:\\Java\\LibraryApp v3\\src\\exercises\\org\\files\\files_exercises\\write\\serializable\\person.obj";
        Person person1 = null;

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
            person1 = (Person)input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Nie udało się odczytać pliku: " + fileName);
            e.printStackTrace();
        }

        if (person1 != null){
            System.out.println("Wczytano dane: " + person1.getFirstName() + " " + person1.getLastName());
        }
    }
}
