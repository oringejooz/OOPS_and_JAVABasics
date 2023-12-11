package Strings_in_JAVA;

public class String_to_Int {
    public static void main(String[] args) {
        String str = "123";
        //Converts string to int only if string is purely int otherwise throws exception 
        int integer = Integer.parseInt(str);
        System.out.println(integer);
    }
}
