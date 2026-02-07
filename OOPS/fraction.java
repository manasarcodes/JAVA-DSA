public class fraction{
    
    public static class Fraction{
        int num;
        int den;
    
    public Fraction(int num,int den){
        this.num = num;
        this.den = den;
    }
    }
    public static void main(String [] arg){
        Fraction f1 = new Fraction(3,6);
        System.out.println(f1.num + "/" + f1.den);
    }
}
