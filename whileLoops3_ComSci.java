import java.util.Scanner;
public class whileLoops3_ComSci {
    public static int rand(){
        return (int)((Math.random()*14)+1);
    }
    public static void main(String[] args) {
        //Multiplication Tutor
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the multiplication tutor!\n");
        System.out.print("What is your name?\t");
        String naam = read.nextLine();
        System.out.println("");
        System.out.println("Let's see how good at multiplication you are "+naam+"...\n");
        System.out.println("Type -1 at any time to exit and see your score.\n\n");
        //
        int continu = 0;
        int x = 0;
        int y = 0;
        int correctumundo = 0;
        int totalo = 0;
        int goodans = 0;
        int ans = 0;
        //
        while (continu==0){
            x = rand();
            y = rand();
            goodans = (x*y);
            System.out.println("What is "+x+" * "+y+"?");
            ans = read.nextInt();
            if (ans == goodans){
                System.out.print("Correct!\n");
                correctumundo++;
                totalo++;
            }
            else if (ans == -1){
                continu++;
            }
            else if (ans != goodans){
                System.out.print("Sorry! The answer was "+(x*y)+"\n");
                totalo++;
            }
        }
        System.out.println("Let's see "+naam+"!!!  You got "+correctumundo+" out of "+totalo+" correct.");
        double percento = correctumundo/totalo;
        if (percento>=0.95){
            System.out.println("You've mastered multiplication.");
        }
        else if (percento>=0.89){
            System.out.println("You almost got it!");
        }
        else{
            System.out.println("You really need to practice :(");
        }
       


    }

}
