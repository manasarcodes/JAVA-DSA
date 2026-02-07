class Pen{
    String colour;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printcolour(){
        System.out.println(this.colour);
    }
}
public class Objectpen{
    public static void main(String [] arg){
        Pen pen1 = new Pen();
        pen1.colour = "pink" ;
        pen1.type = "jel" ;
        pen1.write();
        pen1.printcolour();

    }

}