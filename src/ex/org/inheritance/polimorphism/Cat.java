package ex.org.inheritance.polimorphism;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("Miau miau, jestę " + getName());
    }
    public void miau(){
        System.out.println("Miau miau");
    }
}
