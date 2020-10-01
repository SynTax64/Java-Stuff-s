package S9_Interfaces_AbstractClasses_InnerClasses.Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone deskPhone = new DeskPhone(123456);
        deskPhone.powerOn();
        deskPhone.callPhone(123456);
        deskPhone.answer();
        System.out.println();
        ITelephone mobilePhone = new MobilePhone(123456);
        mobilePhone.powerOn();
        mobilePhone.callPhone(123456);
        mobilePhone.answer();

    }
}
