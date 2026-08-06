public class interfaceinOOp {
    public static void main (String args []) {
        Queen q1 = new Queen ();
        q1.moves();
    }
}

// Declare Interface
interface ChessPlayer {
    void moves ();
}

// inherit interface by implements word 
class Queen implements ChessPlayer {
    public void moves () {
        System.out.println("it moves up down left right and diagonal ");
    }
}

class Rook implements ChessPlayer {
    public void moves (){
        System.out.println("up down left right");
    }
}

class king implements ChessPlayer {
    public void moves () {
        System.out.println("up down left right Diagonal (by 1 step )");
    }
}

