package exercises.org.collections.queue.exercise_to_do_list;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author n2god on 15/07/2019
 * @project Exercises
 */
public class TaskManager {
    private Scanner sc = new Scanner(System.in);
    private Queue<Task> taskQueue = new PriorityQueue<>();

    private static void priontOptions(){
        for (Option option : Option.values()) {
            System.out.println(option);
        }
    }

    public void maniLoop(){
        Option next = null;
        //TODO
    }

    private enum Option{
        ADD(0, "Dodaj zadanie"),
        TAKE(1, "Pokaż zadanie o najwyższym priorytecie"),
        EXIT(2, "Wyjdź z programu");


        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }

        int option;
        String description;

        static Option createFromInt(int option){
            return Option.values()[option];
        }
    }

}
