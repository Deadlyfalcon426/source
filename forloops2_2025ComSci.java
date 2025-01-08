import java.util.Scanner;
public class forloops2_2025ComSci {
    public static int score(){
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("How many scores would you like to input?\t");
        int tcount = read.nextInt();
        int z = 0;
        int good = 0;
        int mid = 0;
        int bad = 0;
        for(int t = tcount;t>0;t--){
            z++;
            System.out.println("Please enter Test #"+z);
            int g = read.nextInt();
            int y = 7;
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

