package Strings_in_JAVA;

public class StringComparison {
    public static void main(String[] args) {
        //compare
        String s1="h";
        String s2="H";

        /*
         * 1) s1 > s2 : +ve value
         * 2) s1 == s2 : 0
         * 3) s1 < s2 : -ve value
        */

        if(s1.compareTo(s2)==0){
            System.out.println("Strings are equal");
        }
        else{
            if(s1.compareTo(s2)>0){
                System.out.println("First string is bigger");
            }
            else{
                System.out.println("Second string is bigger");
            }
        }

        if(new String("Tony") == new String("Tony") ){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
