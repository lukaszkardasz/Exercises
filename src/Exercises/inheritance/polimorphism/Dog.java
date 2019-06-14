package Exercises.inheritance.polimorphism;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void giveSound(){
        System.out.println("Jestę pieseł " + getName());
    }

    public void bark(){
        System.out.println("Hau hau");
    }
}
