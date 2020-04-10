package S5_Control_Flow_Statements;

public class SwitchStatement {
    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else if (value == 3) {
//            System.out.println("Value was 3");
//        } else if (value == 4) {
//            System.out.println("Value was 4");
//        } else {
//            System.out.println("Value is not 1, 2, 3 or 4 but something else.");
//        }

        int switchValue = 2;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value is 3, 4 or 5");
                break;
            default:
                System.out.println("Value is not 1, 2, 3 or 4 but something else.");
                break;
        }
    }
}
