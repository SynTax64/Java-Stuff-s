package S5_Control_Flow_Statements;

public class Challenge1_SwitchStatement {
    public static void main(String[] args) {

        char charValue = 'D';
//        switch (charValue) {
//            case 'A':
//                System.out.println("A was found");
//                break;
//            case 'B':
//                System.out.println("B was found");
//                break;
//            case 'C':
//            case 'D':
//            case 'E':
//                System.out.println(charValue + " was found");
//                break;
//            default:
//                System.out.println("Did'nt found it");
//                break;
//        }
        String stringValue = "JaNUary";

        switch (stringValue.toLowerCase()) {
            case "january":
                System.out.println("jan");
                break;
            case "february":
                System.out.println("feb");
                break;
            case "march":
                System.out.println("mar");
                break;
            case "april":
                System.out.println("apr");
                break;
            case "mai":
                System.out.println("mai");
                break;
            case "june":
                System.out.println("jun");
                break;
            case "july":
                System.out.println("jul");
                break;
            case "august":
                System.out.println("aug");
                break;
            case "september":
                System.out.println("sep");
                break;
            case "october":
                System.out.println("oct");
                break;
            case "november":
                System.out.println("okt");
                break;
            case "dezember":
                System.out.println("dez");
                break;
            default:
                System.out.println("Unknown month");
                break;
        }

    }
}
