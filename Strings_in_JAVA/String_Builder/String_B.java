package Strings_in_JAVA.String_Builder;

public class String_B {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));
        //Set character at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        //INserting a character at a given index and shifting others
        sb.insert(3, 'S');
        System.out.println(sb);
        //Deletion
        sb.delete(3,4);
        System.out.println(sb);
        sb.delete(2, 3);
        System.out.println(sb);
        //Adding to last
        sb.append('h');
        sb.append('e');
        sb.append('l');
        sb.append('l');
        System.out.println(sb);

        System.out.println(sb.length());

    }
}
