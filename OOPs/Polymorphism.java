package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();

        // // Method Overloading
        // calculator cal = new calculator();
        // System.out.println(cal.sum(2,30));
        // System.out.println(cal.sum((float)12.5, (float)23));
        // System.out.println(cal.sum(2, 4, 87));
    }
}

// Method Overriding (Run Time Polymorphism)
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat(){
        System.out.println("eat grass");
    }
}


// // Method Overloading   (Compile Time Polymorphism)
// class calculator{
//     int sum(int a, int b){
//         return a+b;
//     }

//     float sum(float x,float y){
//         return x+y;
//     }

//     int sum(int a, int b, int c){
//         return a+b+c;
//     }
// }