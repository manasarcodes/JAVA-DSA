
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle extends Shape{
    public void area(int l ,int h){
        System.out.println(0.5*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class inheritance{
    public static void main(String [] arg){
        Triangle t1 = new Triangle();
        t1.area(10, 5); // area of triangle = 25.0

        Circle c1 = new Circle();
        c1.area(4); // area of circle = 50.24
    }
}