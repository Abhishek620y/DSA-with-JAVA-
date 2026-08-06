//package Strings;

// import java.util.*;
// public class StrDecl {
//     public static void main (String args []) {
//     //     String str = "abcd"; 
//     //     String str2 = new String ("abcd");
        

//     //  input and output 
//     //     Scanner sc = new Scanner (System.in);
//     //     String name;
//         //name = sc.next();
//         //System.out.println(name);

//         // String name2;
//         // name2 = sc.nextLine();
//         // System.out.println(name);


//         // string lenght 
//         //System.out.println(name.length());


//         // concatenation -- Adding two string 
//         String firstname = "Abhishek";
//         String lastname = "Yadav";

//         String fullname = firstname + " " +  lastname;
//         System.out.println(fullname);

//     }
    
// }



import java.util.*;
public class StrDecl {

    // function to print all element of string 

    // public static void printletter(String str) {
    //     for (int i=0; i<str.length(); i++) {
    //         System.out.print(str.charAt(i) + " ");
    //     }
    //     System.out.println();
    // }
    public static void main (String args []) {
        String firstname = "Abhishek";
        String lastname = "Yadav";
        String fullname = firstname + " " + lastname;

        // to print the specific element in a string 
        System.out.println(firstname.charAt(0));

        //printletter(fullname);

    }
}