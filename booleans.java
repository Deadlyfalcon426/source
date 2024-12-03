import java.util.Scanner;
public class booleans{
    public static void main (String[]args){
        System.out.println("Are you looking to use a (F)orce, (D)istance or (V)olume conversion???");
        @SuppressWarnings("resource")
        Scanner read = new Scanner(System.in);
        String opt = read.nextLine();
        System.out.println("How much are you converting???");
        int quan = read.nextInt();
        if (opt.equalsIgnoreCase("f")){
            System.out.println("Are you converting (N)Newtons to pounds or (P)pounds to Newtons???");
            read.nextLine();
            String forceunits = read.nextLine();

            if (forceunits.equalsIgnoreCase("P")){
                System.out.println(quan*4.45);
            }

            if (forceunits.equalsIgnoreCase("N")){
                System.out.println(quan/4.45);
            }
        }
        if (opt.equalsIgnoreCase("D")){
            System.out.println("Are you converting (F)feet to meters or (M)meters to feet???");
            read.nextLine();
            String distUnits = read.nextLine();

            if (distUnits.equalsIgnoreCase("F")){
                System.out.println(quan/3.28);
            }

            if (distUnits.equalsIgnoreCase("M")){
                System.out.println(quan*3.28);
            }
        }
        if (opt.equalsIgnoreCase("V")){
            System.out.println("Are you converting gallons to liters(G) or liters to gallons(L)???");
            read.nextLine();
            String volUnits = read.nextLine();

            if (volUnits.equalsIgnoreCase("G")){
                System.out.println(quan*3.79);
            }
            
            if (volUnits.equalsIgnoreCase("L")){
                System.out.println(quan/3.79);
            }
        }
    }
}