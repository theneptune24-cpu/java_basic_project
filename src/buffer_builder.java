public class buffer_builder {
    public static void main (String[]args){
        StringBuffer s1=new StringBuffer("Java");
        System.out.println(s1);
        s1.append("Program");
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        s1.replace(0, s1.length(),"Python");
        System.out.println(s1);
    }


    //public static void main (String[]args){
    //     StringBuffer s1=new StringBuffer("Java");
    //     System.out.println(s1);
    //     s1.append("Program");
    //     System.out.println(s1);
    //     s1.reverse();
    //     System.out.println(s1);
    //     s1.reverse();
    //     System.out.println(s1);
    //     s1.replace(0, 4,"Python");
    //     System.out.println(s1);
    //    }


    //public static void main(String[] args) {
    //        StringBuilder s1 = new StringBuilder(" antara ");
    //        String result = s1.toString().trim();
    //        System.out.println(result);
    //    }



}
