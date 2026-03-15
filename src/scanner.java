import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        }
        else if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
    }


    //public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter the string:");
    //        String input = sc.nextLine();
    //        if(!input.contains(" ")) {
    //            System.out.println("Valid User Name");
    //        }
    //        else {
    //            System.out.println("In-Valid User Name");
    //        }
    //    }


    //public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter email:");
    //        String email = sc.nextLine();
    //        int index = email.indexOf('@');
    //        String domain = email.substring(index + 1);
    //        System.out.println("Domain: " + domain);
    //    }


    //public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter password:");
    //        String password = sc.nextLine();
    //        if(password.length() >= 8) {
    //            System.out.println(" Password accepted");
    //        }
    //        else {
    //            System.out.println("Password too short");
    //        }
    //    }


    //    public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter your name:");
    //        String name = sc.nextLine();
    //        System.out.println("Hello " + name + ", welcome to the platform");
    //    }


    //public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter product code:");
    //        String code = sc.nextLine();
    //        char category = code.charAt(0);
    //        System.out.println("Product Category: " + category);
    //    }


    //public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter feedback:");
    //        String feedback = sc.nextLine();
    //        if(feedback.toLowerCase().contains("java")) {
    //            System.out.println("Java found");
    //        }
    //        else {
    //            System.out.println("Java not found");
    //        }
    //    }


    //public static void main(String[] args)
    //    {
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Enter the string:");
    //        String input= sc.nextLine();
    //        int count=0;
    //        for(int i=0;i<input.length();i++)
    //        {
    //            if(input.charAt(i)>='0'&&input.charAt(i)<='9')
    //            {
    //                count++;
    //            }
    //        }
    //        System.out.println("digit count is: "+count);
    //    }


    //public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //
    //        System.out.println("Enter name:");
    //        String str = sc.nextLine();
    //        int count = 0;
    //
    //        for(int i = 0; i < str.length(); i++){
    //            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
    //               str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
    //               str.charAt(i) == 'u'){
    //                count++;
    //            }
    //        }
    //
    //        System.out.println("Vowel count is " + count);
    //    }


    //public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //
    //        System.out.println("Enter sentence:");
    //        String str = sc.nextLine();
    //
    //        String[] words = str.split(" ");
    //
    //        for(int i = 0; i < words.length - 1; i++) {
    //            if(words[i].equals(words[i+1])) {
    //                System.out.println("Duplicate word: " + words[i]);
    //            }
    //        }
    //    }


    //public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //
    //        System.out.println("Enter credit card number:");
    //        String card = sc.nextLine();
    //
    //        for(int i = 0; i < card.length(); i++) {
    //            if(i < card.length() - 4) {
    //                System.out.print("*");
    //            } else {
    //                System.out.print(card.charAt(i));
    //            }
    //        }
    //    }


    //
}
