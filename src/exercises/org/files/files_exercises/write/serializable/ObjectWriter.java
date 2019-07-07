package exercises.org.files.files_exercises.write.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "C:\\Java\\LibraryApp v3\\src\\exercises\\org\\files\\files_exercises\\write\\serializable\\person.obj";
        Person person1 = new Person("Jan", "Kowalski");

        try (ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectStream.writeObject(person1);
            System.out.println("Zapisano obiekt to pliku");

        }
        catch (IOException e) {
            System.err.println("Błąd zapisu pliku: " + fileName);
            e.printStackTrace();
        }


    }
}
