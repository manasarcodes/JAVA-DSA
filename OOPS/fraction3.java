public class fraction3{
    public static int gcd(int num, int den){
        int min = Math.min(num,den);
        for(int i=min;i>=1;i--){
            if(num%i==0 && den%i==0){
                return i;
            }
        }
        return 1;
    }

public static class Fraction{
    int num;
    int den;
    public Fraction(int num, int den){
        this.num = num;
        this.den = den;
    }
    public void simplify(){
        int hcf = gcd(num,den);
        num /= hcf;
        den /= hcf;
    }
}
public static void main(String [] arg){
    Fraction f1 = new Fraction(3,6);
    f1.simplify();
    System.out.println(f1.num + "/" + f1.den);
}
} 