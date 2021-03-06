package exercises.org.inheritance.partShop;

public class Wheel extends Part {

    private byte size;
    private byte width;

    public Wheel(int idNuber, String producent, String model, String series, byte size, byte width) {
        super(idNuber, producent, model, series);
        this.size = size;
        this.width = width;
    }

    public Wheel(){

    }

    public byte getSize() {
        return size;
    }

    public void setSize(byte size) {
        this.size = size;
    }

    public byte getWidth() {
        return width;
    }

    public void setWidth(byte width) {
        this.width = width;
    }
}
