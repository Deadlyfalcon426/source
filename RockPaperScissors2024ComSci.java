import java.util.Scanner;
public class RockPaperScissors2024ComSci {
    public static int play(){
        return (int)(Math.random()*3);
        //0 is rock 
        //1 is paper
        //2 is scissor
    }
    public static void dumbformatting(int choisi){
        System.out.print("Computer selects: ");
        switch (choisi){
            case 0: 
                System.out.println("rock");
            break;
            
            case 1:
                System.out.println("paper");
            break;

            case 2: 
                System.out.println("scissors");
            break;
        }
    }
    public static void decide(int choisi, String choice, int wincount, int losscount){
        switch (choisi){
            //rock
            case 0: 
                switch (choice){
                    case "scissors":
                        wincount += 0;
                        losscount += 1;
                        System.out.print("Computer wins!");
                        break;

                    case "rock":
                        wincount += 0;
                        losscount += 0;
                        System.out.println("Tie");
                        break;

                    case "paper":
                        wincount += 1;
                        losscount += 0;
                        System.out.println("You win!");
                        break;

                }
            break;
//paper
            case 1: 
                switch (choice){
                    case "scissors":
                        wincount += 1;
                        losscount += 0;
                        System.out.print("You win!");
                        break;

                    case "rock":
                        wincount += 0;
                        losscount += 1;
                        System.out.println("Computer wins!");
                    break;

                    case "paper":
                        wincount += 0;
                        losscount += 0;
                        System.out.println("Tie!");
                    break;

                }
            break;
            //scissors
            case 2:    
                switch (choice){
                    case "scissors":
                        wincount += 0;
                        losscount += 0;
                        System.out.print("Tie!");
                        break;

                    case "rock":
                        wincount += 1;
                        losscount += 0;
                        System.out.println("You win!");
                    break;

                    case "paper":
                        wincount += 0;
                        losscount += 1;
                        System.out.println("Computer wins!");
                    break;

                }
            break;
            
        }
    }
    public static void whoWon(int win, int loss){
        if(win>loss){
            System.out.println("You won! Out of 3 games you won "+win+" games");
        }
        if(win==loss){
            System.out.println("Tie! You won 1 round and the computer won 1 round.");
        }
        if(loss>win){
            System.out.println("Lol idiot you lost to a computer. I beat you "+loss+"times!!!");
        }
    }
    public static void main (String[]args){
        //make desicion before game starts!!!
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the holy game of rock-paper-scissors");
        System.out.println("It is a noble tradition where two rivals choose one of their 3 weapons:");
        System.out.println("Rock, paper or scissors!!!");
        System.out.println("They then draw at the same time");
        System.out.println("Rock breaks scissors, scissors cut up paper, and paper covers rock.");
        System.out.println("Shall we partake in this contest of luck?");
        System.out.println("");
        System.out.println("You can choose your draw by typing scissors, rock, or paper");
        
        int choisi = play();
        System.out.println("ROUND 1");
        System.out.println("What is your choice???");
        String choice = read.nextLine().toLowerCase();
        int wincount = 0;
        int losscount = 0;
        dumbformatting(choisi);
        decide(choisi, choice, wincount, losscount);

        choisi = play();
        System.out.println("ROUND 2");
        System.out.println("What is your choice???");
        choice = read.nextLine().toLowerCase();
        dumbformatting(choisi);
        decide(choisi, choice, wincount, losscount);

        choisi = play();
        System.out.println("ROUND 3");
        System.out.println("What is your choice???");
        choice = read.nextLine().toLowerCase();
        dumbformatting(choisi);
        decide(choisi, choice, wincount, losscount);

        System.out.print("Result:   ");
        whoWon(wincount, losscount);
    }
}
