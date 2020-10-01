package S9_Interfaces_AbstractClasses_InnerClasses.Interfaces;

public class Gearbox {
    private boolean clutchIsIn;

    /*public void operateClutch(String str) {
        this.clutchIsIn = str.equalsIgnoreCase("in");
    }*/

    public void operateClutch(boolean clutchIsIn) {
        this.clutchIsIn = clutchIsIn;
    }
}
