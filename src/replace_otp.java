import java.util.Scanner;
public class replace_otp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card number:");
        String card = sc.nextLine();
        String last4 = card.substring(card.length() - 4);
        String masked = card.substring(0, card.length() - 4).replaceAll(".", "*") + last4;
        System.out.println(masked);
    }


    //public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter message:");
    //        String str= sc.nextLine();
    //        System.out.println(str.replace("spam","****"));
    //
    //    }


    //public static void main(String[] args) {
    //
    //        Scanner sc = new Scanner(System.in);
    //        String otp = "";
    //
    //        System.out.println("Enter the String : ");
    //        String input = sc.nextLine();
    //
    //        for(int i = 0; i < input.length(); i++) {
    //            if(Character.isDigit(input.charAt(i))) {
    //                otp = otp + input.charAt(i);
    //            }
    //        }
    //
    //        System.out.println("OTP: " + otp);
    //    }


    //public static void main(String[] args) {
    //        String msg = "ur otp is257342. do not share";
    //        String otp = "";
    //
    //        for(int i = 0; i < msg.length(); i++) {
    //            char ch = msg.charAt(i);
    //
    //            if(Character.isDigit(ch)) {
    //                otp = otp + ch;
    //            }
    //        }
    //
    //        System.out.println("OTP: " + otp);
    //    }
}
