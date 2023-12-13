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
class Students{
    String name;
    int age;
    float percentage;

    void cal_Percentage(int phy, int math, int chem, int bio){
        percentage = (phy+math+chem+bio)/4;
    }
}