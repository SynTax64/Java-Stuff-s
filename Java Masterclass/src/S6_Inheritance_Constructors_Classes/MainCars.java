package S6_Inheritance_Constructors_Classes;

import java.sql.SQLOutput;

public class MainCars {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car audi = new Car();
        Car bmw = new Car();

//        porsche.model = "911";
//        audi.model = "a4";
//        bmw.model = "M5";
//
//        porsche.color = "black";
//        audi.color = "white";
//        bmw.color = "silver";
//
//        porsche.doors = 2;
//        bmw.doors = 4;
//        bmw.doors = 5;
//
//        porsche.engine = "5.0 l";
//        audi.engine = "2.0 TDI";
//        bmw.engine = "4.2 l";
//
//        porsche.wheels = 4;
//        audi.wheels = 4;
//        bmw.wheels = 4;

        porsche.setDoors(2);
        porsche.setWheels(4);
        porsche.setModel("porsche");
        porsche.setEngine("4.2 l");
        porsche.setColor("black");

        audi.setDoors(5);
        audi.setWheels(4);
        audi.setModel("audi");
        audi.setEngine("2.0 TDI");
        audi.setColor("silver");

        bmw.setDoors(4);
        bmw.setWheels(4);
        bmw.setModel("bmw");
        bmw.setEngine("4.2 TDI");
        bmw.setColor("white");

        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(porsche.toString());
    }
}
