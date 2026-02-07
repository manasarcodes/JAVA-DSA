// using constructor
// not able to compile Student and StudentClass
// not working 
public class StudentClass{
    public static void change(Student s){
        s.name = "appa";
        s.marks = 55;
    }
    public static void main(String [] arg){
        Student s1 = new Student("manasa",10,99);
        change(s1);
        System.out.println(s1.name);
        System.out.println(s1.marks);

    }
}
    class Student {
    String name;
    int rollno;
    int marks;

    // 👇 Define this constructor
    Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
}

  