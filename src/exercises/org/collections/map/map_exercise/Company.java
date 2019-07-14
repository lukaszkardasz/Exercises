package exercises.org.collections.map.map_exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author n2god on 13/07/2019
 * @project Exercises
 */
public class Company {
    private HashMap<String, Employee> employees = new HashMap<>();

    public boolean addEmployee(Employee employee){
        String key = employee.getFirstName() + " " + employee.getLastName();
        if (employees.get(key) != null){
            return false;
        } else{
            employees.put(key, employee);
            return true;
        }
    }

    //podajemy klucz, zwraca obiekt employee lub null jesli nie ma takiego
    public Employee getEmployee(String firstName, String lastName){
        String key = firstName + " " + lastName;
        return employees.get(key);
    }

}
