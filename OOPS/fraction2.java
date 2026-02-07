public class fraction2{
    
    public static class Fraction{
        int num;
        int den;
        
        public void simplify(){
            if(num<den){
                if(den%num == 0){
                den = den/num;
                num = 1;
                }
            }
        }
    
    public Fraction(int num,int den){
        this.num = num;
        this.den = den;
    }
    }
    public static void main(String [] arg){
        Fraction f1 = new Fraction(35,21);
        f1.simplify();
        System.out.println(f1.num + "/" + f1.den);
    }
}