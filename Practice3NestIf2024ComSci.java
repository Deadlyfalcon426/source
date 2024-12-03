import java.util.Scanner;
public class Practice3NestIf2024ComSci {
    public static void main (String[]args){
        System.out.println("Would you like a (s)salad, (c)chicken, (b)burgir???");
        @SuppressWarnings("unused")
        Scanner read = new Scanner(System.in);
        String choice = read.nextLine();
        double price = 5;
        if (choice.equalsIgnoreCase("s")){
            price = 12;
        }
        else if (choice.equalsIgnoreCase("c")){
            price = 15;
        }
        else if (choice.equalsIgnoreCase("b")){
            price = 18;
        }
        System.out.println("How old are you???");
        int age = read.nextInt();
        System.out.println("Do you work here??? (y/n)");
        read.nextLine();
        String work = read.nextLine();
        if (age<18){
            if (work.equalsIgnoreCase("y")){
                price = price*0.7;
            }
            else {
                price = price*0.8;
            }
        }
        if (work.equalsIgnoreCase("y")&&(age>18)){
                price = price*0.9;
        }
        System.out.print("That will be $"+price);
    }
}
