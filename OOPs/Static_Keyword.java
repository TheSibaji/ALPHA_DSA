package OOPs;

public class Static_Keyword {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.schoolName = "PCB, Boulakani";

        Student s2 = new Student();
        // s2.schoolName = "NKB";          //if anyone change in anywhere, the new value will be the value for all objects.
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String newName){
        this.name = newName;
    }
    String getName(){
        return this.name;
    }
}