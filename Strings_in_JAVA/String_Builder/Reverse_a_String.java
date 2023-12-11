package Strings_in_JAVA.String_Builder;

public class Reverse_a_String {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Aman");
        for(int i=0;i<str.length()/2;i++){
            int front = i;
            int back = str.length()-i-1;
            char fchar = str.charAt(front);
            char bchar = str.charAt(back);
            str.setCharAt(front, bchar);
            str.setCharAt(back, fchar);
        }
        System.out.println(str);
    }
}
