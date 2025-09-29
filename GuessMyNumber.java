import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        boolean geeked = false;
        int tries = 3;
        {
            System.out.println("Guess a number between 1 - 100:");
            int guess = in.nextInt();
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            System.out.println("Your guess:" + guess);
            while (geeked == false && tries > 0){
                if(guess>number){
                    System.out.println("you were too high");
                    guess = in.nextInt();
                

                }else if(guess< number){
                    System.out.println("you were too low");
                    guess = in.nextInt();

                }else if(guess == number){
                    geeked = true;

                    System.out.println("YOU GOT IT RIGHT! the answer is " + number);
                }
                tries = tries - 1;
            }
        }
        System.out.println("dam you didnt get it, you geeked just like me");
    }
}