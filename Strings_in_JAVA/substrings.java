package Strings_in_JAVA;

public class substrings {
    public static void main(String[] args) {
        String sentence = "My name is Tony";
        // Substring Function
        //     substring(<beginning index>,<ending index>) end index is length-1. By default endong takes last index
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
    }
}
