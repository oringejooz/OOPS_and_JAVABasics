package Obj_Oriented.Static_Keyword;

//Vidhyarthi is Student in Hindi just in case
class Vidhyarthi{
    String name;
    static String school;//MEmbers common to all objects of class
    //Called using CLass name
    //static things are allocated memory only once

    public static void changeSchool(){
        school = "newSchool";
    }
}

public class OOPs_demo {
    public static void main(String[] args) {
        Vidhyarthi.school="JMV";
        Vidhyarthi v1 = new Vidhyarthi();
        v1.name="Ganesh";
        System.out.println(v1.school);
    }
}
