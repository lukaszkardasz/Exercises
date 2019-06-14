package Exercises.inheritance.polimorphism;

public class Zoo {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Mruczek");
        animals[2] = new Animal("Kotopies");

        changeAnimalName(animals[2], "Papugoryba");

        for (Animal animal: animals) {
            animal.giveSound();
        }

        Animal dog = new Dog("pieseł");
        Dog specificDog = (Dog) dog;
        specificDog.bark();



    }
    private static void changeAnimalName(Animal animal, String newName){
        animal.setName(newName);
    }
}
