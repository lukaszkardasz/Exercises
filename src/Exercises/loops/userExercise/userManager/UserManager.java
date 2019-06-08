package Exercises.loops.userExercise.userManager;

import Exercises.loops.userExercise.user.User;

/**
 * @author n2god on 08/06/2019
 * @project Exercises
 */
public class UserManager {

    public static void main(String[] args) {

        User user = new User("Jan", "Kowalski");

        System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o użytkowniku");
        System.out.println("2 - modyfikuj dane użytkownika");

        int option = 2;

        if (option == 0) {
            System.out.println("Bye bye!");
            System.exit(0);
        } else if (option == 1) {
            System.out.println("Uzytkownik: " + user.getFirstName() + ":" + user.getLastName());
        } else if (option == 2) {
            user.setFirstName("Maciek");
            user.setLastName("Buba");
            System.out.println("Zmieniono dane użytkownika na: " + user.getFirstName() + " " + user.getLastName());
        }

    }
}
