package computer.components;

public class HardDisk {
    private String type;
    private float price;

    HardDisk(){
        type = "TBA";
        price = (float) 0.0;
    }

    HardDisk(String type, float price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
