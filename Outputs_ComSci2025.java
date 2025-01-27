public class Outputs_ComSci2025 {
    public static void main(String[] args) {
        //1

        int a = 1;
        int b;
        do { 
            b = a;
            while(b>0){
                b--;
                System.out.print("*");
            }
            System.out.println("");
            a++;
        } while (a<5);

        //2

        System.out.println("");
        int c = 4;
        int d;
        do { 
            d = c;
            while(d>0){
                System.out.print("*");
                d--;
            }
            System.out.println("");
            c--;
        } while (c>0);

        //3

        System.out.println("");
        int e = 1;
        int f;
        do { 
            f = e;
            while(f>0){
                f--;
                System.out.print("***");
            }
            System.out.println("");
            e++;
        } while (e<5);
        
        //4

        System.out.println("");
        for(int g=1;g<5;g++){
            for(int h=g;h>0;h--){
                System.out.println("*");
            }
            System.out.println("X");
        }
        
        //5

        System.out.println("");
        int j = 5;
        for(int i = 3; i>0;i--){
            while(j>0){
                j--;
                System.out.print("*");
            }
            System.out.println("");
        }
        //6

    }
}