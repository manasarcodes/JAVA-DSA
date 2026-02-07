import java.util.Scanner;
public class passingclasstofunction{
    public static void fun(String x){
        System.out.println(x);
        return ;
    }
    public static void main(String[] arg){
        String name = " Manasa ";
        fun(name);
    }
}