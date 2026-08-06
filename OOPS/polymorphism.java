// Method Overloading in Complie time polymorphism

// public class polymorphism {
//     public static void main (String args []) {
//         Calculator calc = new Calculator ();
//         System.out.println(calc.sum(1, 2));
//         System.out.println(calc.sum((float)1.5, (float)2.5));
//         System.out.println(calc.sum(1, 2, 3));
//     }
// }
// class Calculator {

//     int sum  (int a, int b) {
//         return a+b;
//     }

//     float sum (float a, float b) {
//         return a+b;
//     }

//     int sum (int a, int b, int c) {
//         return a+b+c;
//     }
// }


//----------------------------------------------------------
// Method overriding in run time polymorphism  
public class polymorphism {
    public static void main (String args []) {
        Deer d1 = new Deer () ;
        d1.eat();
    }
}
class Animal {
    void eat (){
        System.out.println("eat anything ");
    }
}
class Deer {
    void eat () {
        System.out.println("eat grass");
   }
}

//overriding me agar hum child class ka object create karenge to child class ka hi function call hoga 