import java.util.*;
class BankAccount{
    
    private double Balance;
    public BankAccount(double Balance){
        this.Balance=Balance;
    }
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double Balance){
        this.Balance=Balance;
    }
    public boolean withdraw(double amount){
        if(amount> 0 && amount<=Balance){
            Balance-=amount;
            return true;
        }
        return false;
    }
    public void deposit(double amount)
    {
        if(amount>0){
            Balance+=amount;
            System.out.println("Deposit Successful .Current Balance is : "+getBalance());
        }
    }
    
}
class ATM
{
    private BankAccount account;
    Scanner sc=new Scanner(System.in);
    public ATM(BankAccount account){
        this.account=account;
    }
    public void withdraw()
    {
        System.out.println("Enter Amount for Withdraw :");
        double amount=sc.nextInt();
        if(account.withdraw(amount)){
            System.out.println("Withdrawal Successful.Current Balance is:"+account.getBalance());
        }
        else{
            System.out.println("Insufficient Balance or Invalid Amount.");
        }
    }
    public void deposit(){
        System.out.println("Enter Amount for Deposit");
        double amount=sc.nextInt();
        account.deposit(amount);
   }
   public void checkBalance(){
    System.out.println("Current Balance is : "+account.getBalance());
   }
   public void menu()
   {
    while(true){
        System.out.println("1.Withdraw\n2.Deposit\n3.Check Current Balance\n4.Exit");
        System.out.println("Enter Your Choice :");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                    withdraw();
                break;
            case 2:
                    deposit();
                 break;
            case 3:
                   checkBalance();
                  break;
            case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
            default:
                    System.out.println("Invalid Choice ");
                break;
        }
    }
   }
}
public class AtmInterface {

    public static void main(String[] args) throws Exception {
        BankAccount account=new BankAccount(1000);
        ATM atm=new ATM(account);
        atm.menu();
    }
}
