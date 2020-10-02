package S9_Interfaces_AbstractClasses_InnerClasses.InnerClasses;

public class Main {
    public static void main(String[] args) {
        Gearbox mclaren = new Gearbox(6);
        /*Gearbox.Gear first= mclaren.new Gear(1, 12.3);
        Gearbox.Gear second = mclaren.new Gear((2), 15.4);
        Gearbox.Gear third = mclaren.new Gear((3), 17.8);*/
//        System.out.println(first.driveSpeed(100));

        mclaren.addGear(1, 12.3);
        mclaren.addGear(2, 15.4);
        mclaren.addGear(3, 17.8);
        mclaren.operateClutch(true);
        mclaren.changeGear(1);
        mclaren.operateClutch(false);
        mclaren.changeGear(2);
    }
}
