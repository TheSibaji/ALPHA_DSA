package OOPs;

public class OOPs {
    public static void main(String[] args) {
        // creating obj of pen class
        Pen p1 = new Pen();
        
        p1.setColor("Green");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());


        // bank
        BankAccount ac1 = new BankAccount();
        ac1.user_name = "Sibaji Khillar";
        ac1.setPassword("Sibaji@1234");


        // Students
        Students s1 = new Students();
        Students s2 = new Students(123);
        Students s3 = new Students("Sibaji");
    }
}

class BankAccount{
    public String user_name;
    private String Password;

    public void setPassword(String pwd){
        Password = pwd;
    }
}



// pen class
class Pen{
    // attributes
    private String color;
    private int tip;

    //functions 
    // setters
    void setColor(String Color){
        this.color = Color;
    }
    void setTip(int Tip){
        this.tip = Tip;
    }

    // getters
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}

// student class

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

    // Copy contructor
    Students(int newRoll){
        this.roll = newRoll;
    }

    void cal_Percentage(int phy, int math, int chem, int bio){
        percentage = (phy+math+chem+bio)/4;
    }
}