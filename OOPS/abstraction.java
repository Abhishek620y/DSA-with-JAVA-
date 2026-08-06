// Abstraction 

public class abstraction {
    public static void main (String args []) {

        // Horse h = new Horse ();
        // h.eat();
        // h.walk();

        // chicken c = new chicken ();
        // c.eat();
        // c.walk(); 
        //System.out.print(h.color);

        Mustang Myhorse = new Mustang ();
    }
}

// Abstract class 
abstract class Animal {
    String color;
    
    // constructor 
    Animal () {
        //color = "brown";
        System.out.println("Animal constructor called  ");
    }

    void eat () {
        System.out.println("aniaml eats ");
    }
    
    // abstract function 
    abstract void walk ();
}

class Horse extends Animal {

    // constructor 
    Horse () {
        System.out.println("Horse constructor called ");
    }

    void changecolor () {
        color = "Black";
    }
    void walk () {
        System.out.println("walk on 4 legs ");
    }
}

class Mustang extends Horse {

    // constructor 
    Mustang () {
        System.out.println("Mustang constructor called");
    }
}

class chicken extends Animal {
    void changecolor () {
        color = "yellow";
    }
    void walk () {
        System.out.println("walk on 2 legs ");
    }
}

// Sabse pahle base class ki constructor call hota hai uske bad uska child class ka aur fir uske 
// child clss ka constructor call hota hai 

// yaha par pahle Animal class --> fir Horse class --> last Mustang class ka constructor call huaa hai 