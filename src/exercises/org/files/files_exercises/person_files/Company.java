package exercises.org.files.files_exercises.person_files;

import java.io.Serializable;

/**
 * @author n2god on 06/07/2019
 * @project Exercises
 */
public class Company implements Serializable {

    private static final long serialVersionUID = -3425273230264572679L;
    public static final int MAX_NUMBER_WORKERS = 3;

    private TableOfEmployees[] tableEmployers = new TableOfEmployees[MAX_NUMBER_WORKERS];

    public TableOfEmployees[] getTableEmployers() {
        return tableEmployers;
    }

    public void setTableEmployers(TableOfEmployees[] tableEmployers) {
        this.tableEmployers = tableEmployers;
    }

    public void add(TableOfEmployees tableOfEmployees, int index){
        tableEmployers[index] = tableOfEmployees;
    }
}
