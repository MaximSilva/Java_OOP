package entities;

public class Phone {
    private int price;
    private String description;
    private int weight;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Phone [price=" + price + ", weight=" + weight + ", description=" + description + "]";
    }


}
