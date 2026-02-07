public class creatingclasses{
    // data type creation
    public static class Student{
        String name;
        int rollno;
        double percent;
    }
    public static void main(String [] arg){
        Student x = new Student(); // declaration
        // here x is object of same class
        x.name = "Manasa"; // initialization
        x.rollno = 15; // initialization
        x.percent = 80; // initialization
        System.out.println(x.name);

    }
    // if used "private int rollno " then it can't be used in another file
}