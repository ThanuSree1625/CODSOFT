import java.util.Scanner;
class CurrencyConverter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter amount in INR:");
         double inr=sc.nextDouble();
          System.out.println("Choose Currency");
          int choice;
           System.out.println("1.USD");
            System.out.println("2.EUR");
             System.out.println("3.GBP");
             choice=sc.nextInt();
             double convertedAmount=0;
             if(choice==1){
                convertedAmount=inr/86;
                 System.out.println("USD = $"+convertedAmount);
             }
             else if(choice==2){
                convertedAmount=inr/100;
                 System.out.println("EUR = €"+convertedAmount);
             }
             else if(choice==3){
                convertedAmount=inr/117;
                 System.out.println("GBP = £"+convertedAmount);
             }
             else{
                System.out.println("Invalid choice");
             }

        

    }
}