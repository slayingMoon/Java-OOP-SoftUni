package DesignPatterns_Lab.prototype;

public abstract class Item implements MyCloneable<Item>, Cloneable{
    private String name;
    private String imgURL;
    private double price;


    public Item(String name, String imgURL, double price) {
        this.name = name;
        this.imgURL = imgURL;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }
}
