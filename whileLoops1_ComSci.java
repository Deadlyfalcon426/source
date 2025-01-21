import java.util.Scanner;
public class whileLoops1_ComSci {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a value: ");
        double p = read.nextDouble();
        System.out.print("The powers of "+(int)p+" that are less than 10000 are ");
        int a = 1;
        double s = p;
        int c = 0;
        double z = 0;
        while (p<10000) { 
            a++;
            z = Math.pow(s, (a+1));
            if (z>10000 && c==0){
                c = 1;
                System.out.print((int)p+" and ");
            }
            else {
                System.out.print((int)p);
                if(c==0){
                    System.out.print(", ");
                }
            }
            p = Math.pow(s, a);
            
        }
    }
}

