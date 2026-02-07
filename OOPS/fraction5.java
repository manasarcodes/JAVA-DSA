public class fraction5{
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
        // Print fraction
        public void print() {
            System.out.println(num + "/" + den);
        }
    }

    // Add two fractions
    public static Fraction add(Fraction f1, Fraction f2) {
        int num = f1.num * f2.den + f2.num * f1.den;
        int den = f1.den * f2.den;
        Fraction result = new Fraction(num, den);
        result.simplify();
        return result;
    }

    // Multiply two fractions
    public static Fraction multiply(Fraction f1, Fraction f2) {
        int num = f1.num * f2.num;
        int den = f1.den * f2.den;
        Fraction result = new Fraction(num, den);
        result.simplify();
        return result;
    }


public static void main(String [] arg){
    Fraction f1 = new Fraction(3, 6);
        Fraction f2 = new Fraction(2, 5);

        System.out.print("f1 = ");
        f1.print();
        System.out.print("f2 = ");
        f2.print();

        Fraction f3 = add(f1, f2);
        System.out.print("f1 + f2 = ");
        f3.print();

        Fraction f4 = multiply(f1, f2);
        System.out.print("f1 * f2 = ");
        f4.print();
    
}
}