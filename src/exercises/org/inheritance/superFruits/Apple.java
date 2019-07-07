package exercises.org.inheritance.superFruits;

public class Apple extends Fruit {

    private String gatunek;


    public Apple(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }



    public void printInfo(){
        super.printInfo();
        System.out.println("Japko: " + getGatunek());
    }
}
