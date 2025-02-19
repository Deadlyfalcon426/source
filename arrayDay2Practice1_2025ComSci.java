public class arrayDay2Practice1_2025ComSci{
    public static void main(String[] args) {
        int[] n = new int[6];
        for (int i = 0; i<6; i++){
            n[i] = ((int)(Math.random()*20)+1);
            System.out.print(n[i]+" ");
        }

        System.out.println("");

        int placeholder;
        placeholder = n[4];
        n[4] = n[3];
        n[3] = placeholder;
        for (int i = 0; i<6; i++){
            System.out.print(n[i]+" ");
        }
    }
}