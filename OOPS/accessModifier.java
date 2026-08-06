public class accessModifier {
    public static void main (String args []) {

        Bankaccount Myacc = new Bankaccount ();
        Myacc.userName = "Abhishek26";
        Myacc.setPassword("ssakdd");

        System.out.println(Myacc.userName);
        //System.out.println(Myacc.password);  this nor print the passowrd because password is private 

    } 
}

class Bankaccount {
    public String userName;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
