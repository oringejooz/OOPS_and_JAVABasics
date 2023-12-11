package Obj_Oriented.JAVA_Packages.Access_Modifiers;

/**
 * InnerBank_Access
 */
class Account_Access {

    public String name;
    protected String email;
    private String password;

    //Getters & Setters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password=password;
    }
}

public class Bank_Access {
    public static void main(String[] args) {
        Account_Access account = new Account_Access();
        account.name="customer 1";

        account.setPassword("abcdef@");
        System.out.println(account.getPassword());

    }
}
