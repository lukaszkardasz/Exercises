package exercises.org.inheritance.partShop;

public class Part {

    private int idNuber;
    private String producent;
    private String model;
    private String series;

    public Part(int idNuber, String producent, String model, String series) {
        this.idNuber = idNuber;
        this.producent = producent;
        this.model = model;
        this.series = series;
    }

    public Part() {
    }

    public int getIdNuber() {
        return idNuber;
    }

    public void setIdNuber(int idNuber) {
        this.idNuber = idNuber;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
