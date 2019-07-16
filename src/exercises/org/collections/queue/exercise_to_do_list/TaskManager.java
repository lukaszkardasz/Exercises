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

    public void mainLoop(){
        Option next = null;
        while (next == null || next != Option.EXIT){
            priontOptions();
            next = Option.createFromInt(sc.nextInt());
            sc.nextLine();
            switch (next){
                case ADD:
                    taskQueue.add(readAndCreateTask());
                    break;
                case TAKE:
                    takeTask();
                    break;
                case EXIT:
                    System.out.println("Byee!");
            }
        }
    }

    private Task readAndCreateTask() {
        System.out.println("Podaj nazwę zadania: ");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania: ");
        String desc = sc.nextLine();
        System.out.println("Podaj priorytet (LOW, MODERATE, HIGH)");
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Zadanie zostało dodane!");

        return new Task(name, desc, priority);
    }

    private void takeTask() {
        if (taskQueue.isEmpty()){
            System.out.println("Brak zadań do wykonania!");
        } else{
            Task nextTask = taskQueue.poll();
            System.out.print("Zadanie do wykonania: " + nextTask);
        }
    }

    private enum Option{
        ADD(0, "Dodaj zadanie"),
        TAKE(1, "Pokaż zadanie o najwyższym priorytecie"),
        EXIT(2, "Wyjdź z programu");


        Option(int menuOption, String description) {
            this.menuOption = menuOption;
            this.description = description;
        }

        @Override
        public String toString() {
            return "\n" + menuOption + " - " + description;
        }

        int menuOption;
        String description;

        static Option createFromInt(int option){
            return Option.values()[option];
        }
    }

}
