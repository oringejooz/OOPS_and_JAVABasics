package Strings_in_JAVA;

public class Concatentation_Strings {
    public static void main(String[] args) {
        String firstname = "Tony";
        String lastname = "Stark";
        String fullname = firstname+lastname;
        System.out.println(fullname);
        String fullname_ = firstname+" "+lastname;
        //length()
        System.out.println(fullname_.length());
        int[] array = {1,2,1,2,3,4};
        System.out.println(array.length);

        //charAt method
        System.out.println();
        for(int i = 0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

    }
}
