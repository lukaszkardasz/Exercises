package Exercises.inheritance.extendAndInterfaceDefaultTest;

public interface C {

    default void print(){
        System.out.println("interface C");
    }
}
