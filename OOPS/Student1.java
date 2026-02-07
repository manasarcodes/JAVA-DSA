// using same name
class Studentinfo{
    String name;
    int age;
    
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
}
public class Student1{
    public static void main(String [] arg){
        Studentinfo s1 = new Studentinfo ();
        s1.name = "Manasa";
        s1.age = 18;
        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
    }
}