package S7_Composition_Encapsulation_Polymorphism.MasterChallenge11;

public class Addition {
    private String name;
    private double price;


    public Addition(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
