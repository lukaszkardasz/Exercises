package Exercises.inheritance.objectExercise.computerStore;

public class NotebookShop {

    public static void main(String[] args) {
        Computer notebook1 = new Computer("Acer", 12);
        Computer notebook2 = new Computer("Asus", 4);
        Computer notebook3 = new Computer("Acer", 12);
        Computer notebook4 = new Computer("Lenovo", 122);
        Computer notebook5 = new Computer("Apple", 1);
        Computer notebook6 = new Computer("Apple", 3);

        DataStore dataStore = new DataStore();
        dataStore.add(notebook1);
        dataStore.add(notebook2);
        dataStore.add(notebook3);
        dataStore.add(notebook4);
        dataStore.add(notebook5);
        dataStore.add(notebook6);

        System.out.println(dataStore.checkAvailability(notebook1));

        System.out.println("Wszystkie dostępne komputery:");
        for (Computer c: dataStore.getComputers()) {
            System.out.println(c);
        }
    }
}
