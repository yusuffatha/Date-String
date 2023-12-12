package Datestring;

public class Item {

    private String name;
    private double harga;
    private int quantity;

    public Item(String name, double harga, int quantity) {
        this.name = name;
        this.harga = harga;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getharga() {
        return harga;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}