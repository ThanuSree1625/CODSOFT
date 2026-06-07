import java.util.Random;
import java.util.Scanner;
class NumberGame{
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc =new Scanner(System.in);
       int randomNum =random.nextInt(100);
       randomNum=randomNum+1;
       int guessNum;
       int maxAttempts=5;
       int attempts=0;
       System.out.println("Hii Come and Play Number Game");
       System.out.println("Think about a number between 1 to 100");
       while(attempts < maxAttempts){
        System.out.println("Enter your guess number(1 to 100)");
        guessNum=sc.nextInt();
        attempts++;
        if(guessNum==randomNum){
            System.out.println("Congrats you guessed the correct number");
            System.out.println("you guessed the correct number at"+attempts+"attempt");
            break;
        }
        else if(guessNum > randomNum){
            System.out.println("You guessed the higher number, Try again");
        }
        else{
            System.out.println("You guessed low number Try again");
        }
        if(attempts==maxAttempts && guessNum != randomNum){
            System.out.println("You lose the game you tried all your attempts");
            System.out.println("The random number is :"+randomNum);
        }
       }

    }
}
