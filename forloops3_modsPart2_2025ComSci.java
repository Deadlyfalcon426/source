import java.util.Scanner;

public class forloops3_modsPart2_2025ComSci {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("How many scores would you like to input?\t");
        int tcount = read.nextInt();
        int z = 0;
        int good = 0;
        int mid = 0;
        int bad = 0;
        int re = 3;
        for(int t = tcount;t>0;t--){
            z++;
            System.out.println("Please enter Test #"+z);
            int g = read.nextInt();
            int y = 7;
            if(g<75 && re>0){
                System.out.println("Wow, what a bad score. Do you want a retake?\ny/n");
                read.nextLine();
                String opt = read.nextLine().toLowerCase();
                switch (opt){
                    case "y":
                    System.out.println("What's the new score?");
                    int newg= read.nextInt();
                    if (newg>g){
                        g = newg;
                        System.out.println("It's been corrected. You have "+re+" retakes left.");
                    }
                    else if (newg<g){
                        System.out.println("Somehow you managed to do worse. Fortunately, this score wont be counted.");

                    }
                    else{
                        System.out.print("Same score. Obviously, nothing changes.");
                    }
                    re--;
                    break;

                    case "n":
                    System.out.println("ok cool");
                    break;

                }
            }
            if (g<70){
                bad++;
            }
            else if (g>69 && g<90){
                mid++;
            }
            else if (g>89 && g<101){
                good++;
            }
            else{
                System.out.println("Bro just write a number its not that deep!!");
            }
        }
        System.out.println("Outstanding Scores: "+good+"\n");
        System.out.println("Satisfactory Scores: "+mid+"\n");
        System.out.println("Unsatisfactory Scores: "+bad+"\n");
}
}
