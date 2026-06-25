import java.util.Scanner;
class AtmInterface{
    static double balance=7000;
    static void CheckBalance(){
        System.out.println("Balance: "+balance);
    }
    static void deposit(double amount){
        balance=balance+amount;
        System.out.println("Amount deposited Successfully");
    }
    static void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Amount withdraw successfully");
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.checkBalance");
         System.out.println("2.Deposit");
          System.out.println("3.withdraw");
           System.out.println("Enter your choice:");
           int choice=sc.nextInt();
           if(choice==1){
            CheckBalance();
           }
           else if(choice==2){
             System.out.println("Enter Amount:");
             double amount=sc.nextDouble();
             deposit(amount);
           }
           else if(choice==3){
            System.out.println("Enter Amount: ");
            double amount=sc.nextDouble();
            withdraw(amount);
           }
           else{
             System.out.println("Invalid choice");
           }

    }
}