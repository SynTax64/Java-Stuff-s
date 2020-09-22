package S7_Composition_Encapsulation_Polymorphism.Composition.Challenge9_House;

import S6_Inheritance_Constructors_Classes.CarpetCostCalculator.Floor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp("DayLight", "Bosch", 30, 90, "yellow");
        Sofa sofa = new Sofa(200, 80, 60, "yellow", "leather");
        Flower[] flowers = new Flower[3];
        flowers[0] = new Flower("Rose", 40);
        flowers[1] = new Flower("Jasmine", 60);
        flowers[2] = new Flower("Anthurium", 70);
        Table table = new Table(120, 110, "wood", 4);
        Shelf[] shelfs = new Shelf[2];
        shelfs[0] = new Shelf(160, 10, "white");
        shelfs[1] = new Shelf(140, 8, "black");
        TV tv = new TV("Samsung", "49SE7058", 49, new Resolution(3840, 2160));
        Wall[] walls = new Wall[4];
        walls[0] = new Wall(280, 300, "silver", "south");
        walls[1] = new Wall(280, 300, "silver", "north");
        walls[2] = new Wall(280, 450, "silver", "east");
        walls[3] = new Wall(280, 450, "silver", "west");

        Room room = new Room(walls[0], walls[1], walls[2], walls[3], tv, sofa, shelfs, table, flowers, lamp);
        room.getLamp().turnOn();
    }
}
