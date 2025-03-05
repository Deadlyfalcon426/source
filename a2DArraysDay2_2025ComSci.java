


public class a2DArraysDay2_2025ComSci {
    public static void main(String[] args) {
        //part 1
        //a
        int [] [] array1 = new int[4][6];
        for(int i = 0 ; i<array1.length; i++){
            for(int z = 0;z<array1[i].length;z++){
                array1[i][z] = (int)((Math.random()*71)+7.0);
                System.out.print(array1[i][z]+" ");
            }
            System.out.println("");
        }
        //b
        int sum = 0;
        for(int i = 0; i<array1.length; i++){
            for(int z = 0;z<array1[i].length;z++){
                sum+=array1[i][z];
            }
        }
        System.out.println("Sum is: "+sum);
        //c
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int x = 0; x<array1.length; x++){
            for(int y = 0; y<array1[x].length; y++){
                if(max<array1[x][y]){
                    max = array1[x][y];
                }
                if (min>array1[x][y]){
                    min = array1[x][y];
                }
            }
        }
        System.out.println("The maximum is "+max+" and the minimum is "+min);
        //part 2
        //a
        int[][] array2 = {  {4, 9, 16, 25},
                            {8, 27, 64, 125},
                            {16, 81, 256, 625},
                            {32, 243, 1024, 3125},
                            {64, 729, 4096, 15625}};
        for(int x = 0;x<array2.length;x++){
            for(int y = 0; y<array2[x].length;y++){
                System.out.print(array2[x][y]+" ");
            }
            System.out.println("");
        }
        //b
        int[][] array3 = new int[4][6];
        for(int powX = 2;powX<(array3.length+2);powX++){
            for(int baseY = 2;baseY<(array3[powX].length+2);baseY++){
                array3[powX-2][baseY-2] = (int)(Math.pow((double)baseY, (double)powX));
                System.out.print(array3[powX-2][baseY-2]);
            }
            System.out.println();
        }
    }
}
