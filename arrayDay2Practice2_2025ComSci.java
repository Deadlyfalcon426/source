public class arrayDay2Practice2_2025ComSci {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0;i<10;i++){
            array[i] = i+4;
            System.out.print(array[i]+" ");
        }

        System.out.println("");
        double avg;
        double total=0;

        for(int z = 0;z<10;z++){
            total += array[z];
        }
        avg = total/(double)array.length;
        System.out.println(avg);
    }
}
