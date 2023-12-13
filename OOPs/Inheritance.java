package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        // Dog D1 = new Dog();
        // D1.eat();
        // D1.legs = 4;
        // System.out.println(D1.legs);
    }
}

// Base class  / Parent class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

// Hirarchical Inheritance  :::::::::::::::::::::::::::::::::::::
class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}


// Derived class
// // Multi-Level Inheritance  :::::::::::::::::::::::::::::::::;;
// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal {
//     String breed;
// }


// Derived class  / sub class / child class
// // single inheritance   ::::::::::::::::::::::::::::::::::::

// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swim in water");
//     }
// }