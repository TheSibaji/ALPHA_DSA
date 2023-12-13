package OOPs;

public class Interfases {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();


        Human sk = new Human();
        sk.nonVeg();
        sk.Veg();

        Tiger ti = new Tiger();
        ti.nonVeg();
        // ti.veg();
    }
}

// multiple inheritance
// base interface 1
interface Non_vegit{
    public void nonVeg();
}

// base interface 2
interface vegt{
    public void Veg();
}

//multiple inheritance performing in interface/s
class Human{
    public void nonVeg(){
        System.out.println("Eat non-veg");
    }

    public void Veg(){
        System.out.println("Eat Veg");
    }
}

class Tiger{
    public void nonVeg(){
        System.out.println("Eat only non-veg");
    }
}



// Base interface
interface ChessPlayer{
    void moves();
}

// implemented interface
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all 4 direction)");
    }
}

// implemented interface
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

// implemented interface
class king implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}