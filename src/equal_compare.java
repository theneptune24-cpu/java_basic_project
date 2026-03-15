public class equal_compare {
    public static void main (String[]args){
        String s1="java";
        String s2="Java";
        String s3="Python";
        String s4="java";
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }


    //public static void main (String[]args){
    //     String s1="Java";
    //     String s2="Java";
    //     String s3="java";
    //     System.out.println(s1==s2);
    //     System.out.println(s1==s3);
    //    }


    //public static void main (String[]args){
    //     String s1="sachin";
    //     String s2="sachin";
    //     String s3="rohith";
    //     System.out.println(s1.compareTo(s2)); //0 bcoz s1==s2
    //     System.out.println(s1.compareTo(s3)); //1 bcoz s1>=s3
    //     System.out.println(s3.compareTo(s1)); //-1 bcoz s3<1
    //    }
}
