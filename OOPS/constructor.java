//   Constructor---------------------

// import java.util.Scanner;

// public class constructor {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter name: ");
//         String name = sc.nextLine();
        
//         System.out.println("enter age: ");
//         int age = sc.nextInt();
        
//         // constructor call 
//         Student s1 = new Student (name, age);

//         System.out.println(s1.name);
//         System.out.println(s1.age);
//     }
// }
// class Student {
//     String name;
//     int age;
    
//     // Constructor 
//     Student (String name, int age) {
//         //System.out.println("constructor is called ... ");
//         this.name = name ;
//         this.age = age;
//     }
// }


// agar mein student class ke name aur age ko private kar du to mujhe getter ka use karna padega 
// name aur age ko access karne ke liye 



// cpoy consructor----------------------------------------------------

// import java.util.Scanner;

// public class constructor {
//     public static void main  (String args []) {
        
//         Students s1= new Students();
//         s1.name = "Abhsihek";
//         s1.roll = 123;
//         s1.password = "abhis";
//         s1.marks[0] =100;
//         s1.marks[1]=96;
//         s1.marks[2]=95;

//         Students s2 = new Students(s1);
//         s2.password = "KUamr";
//         s1.marks[2] = 100;

//         for (int i=0; i<3; i++) {
//             System.out.println(s2.marks[i]);
//         }
//     }
// }

// class Students {
//     String name;
//     int roll;
//     int marks [];
//     String password;
    
//     // copy constructor
//     Students(Students s1) {
//         marks = new int [3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;
//     }
//     Students() {
//         marks = new int[3]; 
//     }
//     Students (String name) {
//         marks = new int [3];
//         this.name = name;
//     }
//     Students (int roll) {
//         marks = new int [3];
//         this.roll = roll;
//     }
// } 



// shallow and deep copy constructor-----------------------------------
public class constructor {
    public static void main  (String args []) {
        
        Students s1= new Students();
        s1.name = "Abhsihek";
        s1.roll = 123;
        s1.password = "abhis";
        s1.marks[0] =100;
        s1.marks[1]=96;
        s1.marks[2]=95;

        Students s2 = new Students(s1);
        s2.password = "KUamr";
        s1.marks[2] = 100;

        for (int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Students {
    String name;
    int roll;
    int marks [];
    String password;
    
    // shallow copy constructor
    // Students(Students s1) {
    //     marks = new int [3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor 
    Students (Students s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        for (int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Students() {
        marks = new int[3]; 
    }
    // Students (String name) {
    //     marks = new int [3];
    //     this.name = name;
    // }
    // Students (int roll) {
    //     marks = new int [3];
    //     this.roll = roll;
    // }
} 

