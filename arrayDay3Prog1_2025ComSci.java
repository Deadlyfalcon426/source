public class arrayDay3Prog1_2025ComSci {
    public static void main(String[] args) {
        //prog 1
        int[] duck = new int[30];
        for(int i=0;i<duck.length;i++){
            duck[i] = (int)((Math.random()*31)+5);
        }
        for(int i=0;i<duck.length;i++){
            System.out.print(duck[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        //prog 2
        for(int i = 0; i<duck.length;i++){
            if (i%2 == 0){
            duck[i] *=3;
            }
            System.out.print(duck[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        //prog 3
        int temp;
        for(int i = 0; i<duck.length;i++){
            if (i%2==1){
                duck[i] = duck[i-1];
            }
            System.out.print(duck[i]+" ");
        }


    }
}
