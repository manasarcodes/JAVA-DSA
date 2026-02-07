class Account{
    public String name;
    private String password; 
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}
public class bank{
    public static void main(String [] arg){
        Account Account1 = new Account();
        Account1.name = "Customer1";
        Account1.setPassword("abcd");
        System.out.println(Account1.getPassword());
    }
}