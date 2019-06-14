package Exercises.inheritance.partShop;

public class ExhaustPart extends Part {

    private boolean isApplyingEURO5;

    public ExhaustPart(int idNuber, String producent, String model, String series, boolean isApplyingEURO5) {
        super(idNuber, producent, model, series);
        this.isApplyingEURO5 = isApplyingEURO5;
    }

    public ExhaustPart() {
    }

    public boolean isApplyingEURO5() {
        return isApplyingEURO5;
    }

    public void setApplyingEURO5(boolean applyingEURO5) {
        isApplyingEURO5 = applyingEURO5;
    }
}
