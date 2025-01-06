import java.util.Scanner;
public class RockPaperScissors2024ComSci3 {
    public static void intro(){
        System.out.println("Welcome to the holy game of rock-paper-scissors");
            System.out.println("It is a noble tradition where two rivals choose one of their 3 weapons:");
            System.out.println("Rock, paper or scissors!!!");
            System.out.println("They then draw at the same time");
            System.out.println("Rock breaks scissors, scissors cut up paper, and paper covers rock.");
            System.out.println("Shall we partake in this contest of luck?");
            System.out.println("");
            System.out.println("You can choose your draw by typing scissors, rock, or paper");
    }

    public static int roll(){
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

    public static void whoWon(int win, int loss){
        if(win>loss){
            System.out.println("You won! Out of 3 games you won "+win);
        }
        if(win==loss){
            System.out.println("Tie! You won "+win+" round and the computer won "+loss+" round.");
        }
        if(loss>win){
            System.out.println("Lol idiot you lost to a computer. I beat you "+loss+" times!!!");
        }
    }
    public static void main(String[] args) {
        //intialization of variables
        //win in human's terms
        Scanner read = new Scanner(System.in);
        int win = 0;
        int loss = 0;
        //
        intro();
        int roll = roll();
        System.out.println("\n\nROUND 1");
        System.out.println("What is your choice???");
        String choice = read.nextLine().toLowerCase();
        dumbformatting(roll);
        switch (roll){
            //rock
            case 0: 
                switch (choice){
                    case "scissors":
                        win += 0;
                        loss += 1;
                        System.out.print("Computer wins!");
                    break;

                    case "rock":
                        win += 0;
                        loss += 0;
                        System.out.println("Tie");
                    break;

                    case "paper":
                        win += 1;
                        loss += 0;
                        System.out.println("You win!");
                    break;

                    default:
                        System.out.println("Invalid option, restart program");
                    break;
                }
            break;
//paper
            case 1: 
                switch (choice){
                    case "scissors":
                        win += 1;
                        loss += 0;
                        System.out.print("You win!");
                    break;

                    case "rock":
                        win += 0;
                        loss += 1;
                        System.out.println("Computer wins!");
                    break;

                    case "paper":
                        win += 0;
                        loss += 0;
                        System.out.println("Tie!");
                    break;

                    default:
                        System.out.println("Invalid option, restart program");
                    break;

                }
            break;
            //scissors
            case 2:    
                switch (choice){
                    case "scissors":
                        win += 0;
                        loss += 0;
                        System.out.print("Tie!");
                    break;

                    case "rock":
                        win += 1;
                        loss += 0;
                        System.out.println("You win!");
                    break;

                    case "paper":
                        win += 0;
                        loss += 1;
                        System.out.println("Computer wins!");
                    break;

                    default:
                        System.out.println("Invalid option, restart program");
                    break;

                }
            break;
            
        }

        roll = roll();
        System.out.println("\n\nROUND 2");
        System.out.println("What is your choice???");
        choice = read.nextLine().toLowerCase();
        dumbformatting(roll);
        switch (roll){
            //rock
            case 0: 
                switch (choice){
                    case "scissors":
                        win += 0;
                        loss += 1;
                        System.out.print("Computer wins!");
                    break;

                    case "rock":
                        win += 0;
                        loss += 0;
                        System.out.println("Tie");
                    break;

                    case "paper":
                        win += 1;
                        loss += 0;
                        System.out.println("You win!");
                    break;

                    default:
                        System.out.println("Invalid option, restart program");
                    break;
                }
            break;
//paper
            case 1: 
                switch (choice){
                    case "scissors":
                        win += 1;
                        loss += 0;
                        System.out.print("You win!");
                    break;

                    case "rock":
                        win += 0;
                        loss += 1;
                        System.out.println("Computer wins!");
                    break;

                    case "paper":
                        win += 0;
                        loss += 0;
                        System.out.println("Tie!");
                    break;

                    default:
                        System.out.println("Invalid option, restart program");
                    break;

                }
            break;
            //scissors
            case 2:    
                switch (choice){
                    case "scissors":
                        win += 0;
                        loss += 0;
                        System.out.print("Tie!");
                    break;

                    case "rock":
                        win += 1;
                        loss += 0;
                        System.out.println("You win!");
                    break;

                    case "paper":
                        win += 0;
                        loss += 1;
                        System.out.println("Computer wins!");
                    break;

                    default:
                        System.out.println("Invalid option, restart program");
                    break;

                }
            break;
            
        }

        roll = roll();
        System.out.println("\n\nROUND 3");
        System.out.println("What is your choice???");
        choice = read.nextLine().toLowerCase();
        dumbformatting(roll);
        switch (roll){
            //rock
            case 0: 
                switch (choice){
                    case "scissors":
                        win += 0;
                        loss += 1;
                        System.out.print("Computer wins!");
                    break;

                    case "rock":
                        win += 0;
                        loss += 0;
                        System.out.println("Tie");
                    break;

                    case "paper":
                        win += 1;
                        loss += 0;
                        System.out.println("You win!");
                    break;

                    default:
                        System.out.println("Invalid option, restart program");
                    break;
                }
            break;
//paper
            case 1: 
                switch (choice){
                    case "scissors":
                        win += 1;
                        loss += 0;
                        System.out.print("You win!");
                    break;

                    case "rock":
                        win += 0;
                        loss += 1;
                        System.out.println("Computer wins!");
                    break;

                    case "paper":
                        win += 0;
                        loss += 0;
                        System.out.println("Tie!");
                    break;

                    default:
                        System.out.println("Invalid option, restart program");
                    break;
                }
            break;
            //scissors
            case 2:    
                switch (choice){
                    case "scissors":
                        win += 0;
                        loss += 0;
                        System.out.print("Tie!");
                    break;

                    case "rock":
                        win += 1;
                        loss += 0;
                        System.out.println("You win!");
                    break;

                    case "paper":
                        win += 0;
                        loss += 1;
                        System.out.println("Computer wins!");
                    break;

                    default:
                        System.out.println("Invalid option, restart program");
                    break;
                }
            break;
            
        }

        System.out.print("Result:   ");
        whoWon(win, loss);

    }
}
