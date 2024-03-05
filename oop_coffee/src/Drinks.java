import java.util.Scanner;

public class Drinks {

    public String size;
    public int sugartbs;
    private double price;

    public Drinks (String size, int sugartbs, double price) {
        this.size = size;
        this.sugartbs = sugartbs;
    }

    Drinks () {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSugartbs() {
        return sugartbs;
    }

    public void setSugartbs(int sugartbs) {
        this.sugartbs = sugartbs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
