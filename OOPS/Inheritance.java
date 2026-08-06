// public class Inheritance {
//     public static void main (String args []) {
//         Fish shark = new Fish ();
//         shark.eat();
//     }
// }

// // Base class 
// class Animal {
//     String color;
    
//     void eat () {
//         System.out.println("Eats");
//     }

//     void breath () {
//         System.out.println("Breaths");
//     }
// }

// // Derived class or subclass 
// class Fish extends Animal {
//     int fins;

//     void swim () {
//         System.out.println("fish is swim in water");
//     }
// }


// ---------------------------------------------------------
//  Heirarchical Inheritance 
public class Inheritance {
    public static void main (String args []) {
        
        
    }
}

// Base class 
class Animal {
    String color;
    
    void eat () {
        System.out.println("Eats");
    }

    void breath () {
        System.out.println("Breaths");
    }
}

// Derived class or subclass 
class Fish extends Animal {
    int fins;

    void swim () {
        System.out.println("fish is swim in water");
    }
}

class shark extends Fish {
    int length;

    void Seawater () {
        System.out.println("Found in sea");
    }
}

class Tunna extends Fish {
    int weight;

    void lowWeight() {
        System.out.println("less wieght as compare to shark");
    }

}

class Bird extends Animal {
    int wings;

    void fly() {
        System.out.println("Fly");
    }
}

class Peacock extends Bird {
    String legs;

    void dance () {
        System.out.println("it dance in rainy season");
    }
}

class Mammals extends Animal  {
    String walk;

    void walk() {
        System.out.println("walk");
    }

}

class dog extends Mammals {
    String bread;

    void Bark () {
        System.out.println("Dogs are bark ");
    }
}

class cat extends Mammals {
    String type;

    void meuw () {
        System.out.println("cats are meuw");
    }
}

class human extends Mammals {
    String understand;

    void speak () {
        System.out.println("Humans are speak ");
    }
}