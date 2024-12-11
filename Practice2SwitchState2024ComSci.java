import java.util.Scanner;
public class Practice2SwitchState2024ComSci {
    public static int large (int a, int b, int c){
        int d = 0;
        if (a>b){
            if (a>c){
                d = a;
            }
            if (c>a){
                d = c;
            }
        }
        if (b>c){
            if (b>a){
                d = b;
            }
            if (c>a){
                d = c;
            }
        }
        else{
            d = c;
        }
        return d;
    }
    public static int small (int a, int b, int c){
        int d = 0;
        if (a<b){
            if (a<c){
                d = a;
            }
            if (c<a){
                d = c;
            }
        }
        if (b<c){
            if (b<a){
                d = b;
            }
            if (c<a){
                d = c;
            }
        }
        else{
            d = c;
        }
        return d;
    }
    public static void main (String[]args){
        Scanner read = new Scanner(System.in);
        System.out.println("Choose operation");
        System.out.println("sum, average, product or difference");
        String x = read.nextLine().toLowerCase();

        System.out.println("Number 1");
        int a = read.nextInt();

        System.out.println("Number 2");
        int b = read.nextInt();

        System.out.println("Number 3");
        int c = read.nextInt();
        int l = large(a, b, c);
        int s = small(a, b, c);
        switch (x) {
            case "sum": System.out.println(a+b+c);
            break;

            case "average": System.out.println((a+b+c)/3.0);
            break;

            case "product":  System.out.println(l*s);
            break;

            case "difference": System.out.println(l-s);
            break;

            default: System.out.println("Learn how to type idiot");
        }
    }
}
