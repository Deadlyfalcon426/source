public class arrayDay2Practice3_2025ComSci {
    public static void main(String[] args) {
        int[] array = new int[8];
        for(int i = 0; i<8; i++){
            array[i] = i+1;
        }

        for(int y = 0;y<8;y++){
            System.out.print(array[y]+" ");
        }

        System.out.println("");

        int up = 0;
        int down = 7;
        int placeholder;

        while (down>up) { 
            placeholder = array[up];
            array[up] = array[down];
            array[down] = placeholder;
            up++;
            down--;
        }
        for(int g = 0;g<8;g++){
            System.out.print(array[g]+" ");
        }
    }
}
