import java.util.Scanner;
public class Practice1SwitchState2024ComSci{
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        System.out.println("What is your earth weight???");
        double x = read.nextDouble();
        read.nextLine();
        System.out.println("Which planet are you calculating weight on???");
        String plan = read.nextLine().toLowerCase();
        System.out.print("The weight on "+plan+" would be ");
        switch (plan){
            case "earth": System.out.print(x);
            break;

            case "mars": System.out.print(Math.round(x*0.39*10)/10);
            break;

            case "jupiter": System.out.print(Math.round(x*2.65*10)/10);
            break;

            case "mercury": System.out.print(Math.round(x*0.38*10)/10);
            break;

            case "neptune": System.out.print(Math.round(x*1.23*10)/10);
            break;

            case "pluto": System.out.print(Math.round(x*0.05*10)/10);
            break;

            case "saturn": System.out.print(Math.round(x*1.17*10)/10);
            break;

            case "uranus": System.out.print(Math.round(x*1.05*10)/10);
            break;

            case "venus": System.out.print(Math.round(x*0.78*10)/10);
            break;

            default: System.out.print("IDK");
            break;
        }
        System.out.println(" pounds");

    }
}