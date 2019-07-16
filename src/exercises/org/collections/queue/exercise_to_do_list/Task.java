package exercises.org.collections.queue.exercise_to_do_list;

import java.util.Objects;

/**
 * @author n2god on 16/07/2019
 * @project Exercises
 */
public class Task implements Comparable<Task>{

    private String name;
    private String description;
    private Priority priority;

    public Task(String name, String description, Priority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task o) {
        return priority.compareTo(o.getPriority());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) &&
                Objects.equals(description, task.description) &&
                priority == task.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, priority);
    }

    @Override
    public String toString() {
        return "Task: " + name + " - " + description + ", " + priority;
    }

    public enum Priority {
        HIGH, MODERATE, LOW;
    }
}




