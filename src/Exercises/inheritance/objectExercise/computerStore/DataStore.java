package Exercises.inheritance.objectExercise.computerStore;

public class DataStore {
    private final int MAX_STORED_COMPUTERS = 100;

    private Computer[] computers = new Computer[MAX_STORED_COMPUTERS];
    private int computersNumber;

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
        //table without nulls
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getComputersNumber() {
        return computersNumber;
    }

    public void setComputersNumber(int computersNumber) {
        this.computersNumber = computersNumber;
    }

    public void add(Computer computer){
        if (computersNumber < MAX_STORED_COMPUTERS && computer != null){
                computers[computersNumber] = computer;
                computersNumber++;
        }
    }

    public int checkAvailability(Computer computerToFind){
        if (computerToFind == null){
            return 0;
        }
        int avilableComputers = 0;
        for (int i = 0; i < computersNumber; i++) {
            if (computers[i].equals(computerToFind)){
                avilableComputers++;
            }
        } return avilableComputers;
    }
}
