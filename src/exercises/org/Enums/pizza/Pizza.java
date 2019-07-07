package exercises.org.Enums.pizza;

public enum Pizza {

    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, false, true),
    PROSCIUTTO(true, true, true, false);

    private boolean cheese;
    private boolean mushrooms;
    private boolean ham;
    private boolean tomatoSauce;

    Pizza(boolean tomatoSauce, boolean cheese, boolean ham, boolean mushrooms) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.ham = ham;
        this.mushrooms = mushrooms;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    public boolean isHam() {
        return ham;
    }

    public void setHam(boolean ham) {
        this.ham = ham;
    }

    public boolean isTomatoSauce() {
        return tomatoSauce;
    }

    public void setTomatoSauce(boolean tomatoSauce) {
        this.tomatoSauce = tomatoSauce;
    }

    @Override
    public String toString() {
        String result = this.name() + " (";

        if (tomatoSauce) {
            result += "sos pomidorowy";
        }
        if (cheese) {
            result += ", ser";
        }
        if (mushrooms) {
            result += ", pieczarki";
        }
        if (ham) {
            result += ", szynka";
        }
        result += ")";
        return result;
    }
}
