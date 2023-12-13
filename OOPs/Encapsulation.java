package OOPs;

public class Encapsulation {
    public static void main(String[] args) {
        // Students
        Students s1 = new Students();
        Students s2 = new Students(123);
        Students s3 = new Students("Sibaji");
    }
    
}

// Implementing Encapsulation 
class Students{
    String name;
    int age;
    int roll;
    float percentage;

    // non-parameterized constuctor
    Students(){
        System.out.println("This is non-parameterized constuctor");
    }

    // Parameterized constuctor (can take multiple para-meter)
    Students(String newName){
        this.name = newName;
    }

    Students(int newRoll){
        this.roll = newRoll;
    }

    void cal_Percentage(int phy, int math, int chem, int bio){
        percentage = (phy+math+chem+bio)/4;
    }
}