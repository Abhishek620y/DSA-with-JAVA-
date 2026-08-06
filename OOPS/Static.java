// public class Static {
//     public static void main (String args []) {
//         Student s1 = new Student();
//         s1.Schoolname = "svm";

//         Student s2 = new Student ();
//         System.out.println(s2.Schoolname);
//     }
    
// }

// class Student {

//     static int calculatePercentage(int chem, int phy, int math) {
//         return (chem + phy + math) / 3;
//     }

//     String name;
//     int roll;

//     static String Schoolname;

//     void setName (String name) {
//         this.name= name;
//     }

//     String getname() {
//         return this.name;
//     }
// }

// Agar humne kisi variable ko static banaya to agar hum uska value change karenge to wo value 
// sare object ke liye change hoga 

// static ke use se multiple creation nahi hota hai memory me 

// ---------------------------------------------------------------------------

// Super Keyword 

public class Static {
    public static void main (String args []) {
        Horse h1 = new Horse ();
        System.out.println(h1.color);
    }
}

class Animal {
    String color;

    Animal () {
        System.out.println("Animal contructor is called ");
    }
} 

class Horse extends Animal  {
    Horse () {
        super.color = "brown";
        System.out.println("Horse contructor is called");
    }
}