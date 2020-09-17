package S6_Inheritance_Constructors_Classes.CarpetCostCalculator;

import S6_Inheritance_Constructors_Classes.Car;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
