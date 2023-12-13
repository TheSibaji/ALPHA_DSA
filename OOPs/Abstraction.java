package OOPs;

public class Abstraction {
    public static void main(String[] args) {
        Hourse h = new Hourse();
        h.eat();
        h.walk();
        System.out.println(h.color);    //it call the base/parrent class property
        h.changeColor();                //it change the current obj to current property
        System.out.println(h.color);

        // Hen chik = new Hen();
        // chik.eat();
        // chik.walk();
        // // System.out.println(chik.color);
    }
}


// Abstract class
abstract class Animal{
    String color;

    Animal(){
        color = "White";
    }
    
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Hourse extends Animal{
    void changeColor(){
        color = "Black & White";
    }

    void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Hen extends Animal{
    void changeColor(){
        color = "yellow";
    }

    void walk(){
        System.out.println("walk on 2 legds");
    }
}