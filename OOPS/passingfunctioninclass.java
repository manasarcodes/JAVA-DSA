import java.util.Scanner;
public class passingfunctioninclass{
    public static class Student{
        String name;
        int rollno;
        double percent;
    }
    public static void fun(Student x){
        System.out.println(x.name);
        return;
    }
    public static void main(String [] arg){
        Student s1 = new Student();
        s1.name = "Manasa";
        s1.rollno = 15;
        s1.percent = 99;
        fun(s1);
    }
}

// passing class to functions
// 1. we have to declare the class outside main
// 2. classes are passed by reference
// 3. classes are user defined data type