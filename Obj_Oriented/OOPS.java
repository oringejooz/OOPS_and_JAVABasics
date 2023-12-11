package Obj_Oriented;

class Pen{

    String colour;
    String type;//Ball or Gel

    public void write(){
        System.out.println(this.colour+" pen is writing");
        /*this keyword in java, that points to the object calling the member function*/
    }
}

//Class is a user-defined data type which defines its properties and its
// functions. Class is the only logical representation of the data. For
// example, Human being is a class. The body parts of a human being are its
// properties, and the actions performed by the body parts are known as
// functions. The class does not occupy any memory space till the time an
// object is instantiated.

/*
Object is a run-time entity. It is an instance of the class. An object can
represent a person, place or any other item. An object can operate on
both data members and member functions.
*/

public class OOPS {
    public static void main(String[] args) {

        Pen pen1 = new Pen();//Object creation/Instantiation
        Pen pen2 = new Pen();
        pen1.colour="Blue";
        pen2.colour="Black";
        pen1.type="red";
        pen2.type="black";
        pen1.write();
        pen2.write();
        
    }
}
