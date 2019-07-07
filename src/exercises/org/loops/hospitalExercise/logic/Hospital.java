package exercises.org.loops.hospitalExercise.logic;

import exercises.org.loops.hospitalExercise.model.Patient;

/**
 * @author n2god on 09/06/2019
 * @project org
 */
public class Hospital {

    private final int maxPatientNumber = 10;
    Patient[] patients = new Patient[maxPatientNumber];
    private int actualPatients = 0;

    public void addPatient(Patient patient){
        if (actualPatients < maxPatientNumber){
            patients[actualPatients] = patient;
            actualPatients++;
        } else{
            System.out.println("Max patients number reached: " + maxPatientNumber);
        }
    }

    public void printPatients(){
        for (int i = 0; i < actualPatients; i++) {
            System.out.println(patients[i].getFirstName() + " " +
                    patients[i].getLastName() + " " +
                    patients[i].getPesel());
        }
    }


}
