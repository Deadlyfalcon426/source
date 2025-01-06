import java.util.Scanner;
public class forloops2_2025ComSci {
    public static int score(){
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("How many scores would you like to input?");
        int tcount = read.nextInt();
        int z = 0;
        for(int t = tcount;t>0;t--){
            z++;
            System.out.println("Please enter Test #"+z);
            int t1 = score();
        }
    }
}

