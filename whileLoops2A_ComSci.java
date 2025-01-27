import java.util.Scanner;

public class whileLoops2A_ComSci {
    public static void main(String[] args) {


        //initialization
        Scanner read = new Scanner(System.in);
        int Magic = ((int)(Math.random()*10))+1;
        int score = 5;
        int ans;
        int gameOn = 1;


        //intro
        System.out.println("Guess the number! It's between 1 and 10.");
        System.out.println("You start with 5 tries.");
        System.out.println("");


        while (score>0 && gameOn == 1){
            score--;
            System.out.println("You have "+(score+1)+" tries. Guess a number.");
            ans = read.nextInt();
            if (ans == Magic){
                gameOn--;
                System.out.print("Correct! The number was "+Magic+". Your score is "+(score+1));
            }
            else if (ans != Magic){
                if (score != 0){
                    System.out.println("No, that's not right. Try again.\n");
                }
                else {
                    gameOn--;
                    System.out.println("You lose. You have run out of tries. The number was "+Magic);
                }
               
            }
        }
    }

}
