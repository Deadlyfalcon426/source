import java.util.Scanner;
public class SwitchState2024ComSci {
    public static void main (String[]args){
            @SuppressWarnings("resource")
            Scanner read = new Scanner(System.in);
            System.out.println("Price of item");
            double x = read.nextDouble();
            System.out.println("Item department");
            System.out.println("audio(310), video(438), communications(652), other departments");
            int y = read.nextInt();
            System.out.println("Normal price: "+x);
            System.out.print("Sale price: ");
            switch (y){
                case 310: System.out.println(x*0.9);
                break;
                case 438: System.out.println(x*(1.00-0.12));
                break;
                case 652: System.out.println(x*0.85);
                break;
                default: System.out.println(x*0.95);
                break;
            }   

    }
}
