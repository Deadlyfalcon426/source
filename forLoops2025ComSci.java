import java.util.Scanner;
public class forLoops2025ComSci {
    //exercise 1
    public static void num1(){
        for(int i = 1; i<10; i++){
            System.out.print(i+" ");
        }
    }
    //exercise 2
    public static void num2(){
        for(int i = 6; i<=9;i++){
            System.out.print(i+" ");
        }
    }
    //exercise 3
    public static void num3(){
        for(int i = 10;i>0;i--){
            System.out.print(i+" ");
        }
    }
    //exercise 4
    public static void num4(){
        for(int i=0;i<2;i++){
            System.out.print(i+" ");
        }
    }
    //exercise 5
    public static void num5() {
        for(int i =5;i<=30;i=(i+5)){
            System.out.print(i+" ");
        }
        
    }
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        System.out.println("Which exercise would you like to see?");
        System.out.println("1\t2\t3\t4\t5\n\n");
        int ch = read.nextInt();
        switch(ch){
            case 1:
                num1();
            break;

            case 2:
                num2();
            break;

            case 3:
                num3();
            break;

            case 4:
                num4();
            break;

            case 5:
                num5();
            break;
        }
    }
}
