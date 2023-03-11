package entities;

public class Laptop {
    private int price;
    private int weight;
    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Laptop{" + "price=" + price + ", weight=" + weight + ", description='" + description + '\'' + '}';
    }
}
