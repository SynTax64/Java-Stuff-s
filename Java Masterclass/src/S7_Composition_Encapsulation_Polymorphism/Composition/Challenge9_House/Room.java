package S7_Composition_Encapsulation_Polymorphism.Composition.Challenge9_House;

public class Room {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private TV tv;
    private Sofa sofa;
    private Shelf[] shelfs;
    private Table table;
    private Flower[] flowers;
    private Lamp lamp;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, TV tv, Sofa sofa, Shelf[] shelfs, Table table, Flower[] flowers, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.tv = tv;
        this.sofa = sofa;
        this.shelfs = shelfs;
        this.table = table;
        this.flowers = flowers;
        this.lamp = lamp;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public TV getTv() {
        return tv;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Shelf[] getSelf() {
        return shelfs;
    }

    public Table getTable() {
        return table;
    }

    public Flower[] getFlower() {
        return flowers;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
