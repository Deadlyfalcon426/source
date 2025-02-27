public class a2DArraysTask1_2025ComSci{
    public static void main(String[] args) {
        int matrix1 [] [] = new int [10] [10];

        //A

        for(int i = 0; i<matrix1.length; i++){
            for(int z = 0; z<matrix1[i].length; z++){
                matrix1 [i] [z]= (int)((Math.random()*83)+10);
                System.out.print(matrix1 [i] [z]+"\t");
            }
            System.out.println();
        }
        System.out.println("!#%$&*%$#@!$#@%#^^$%$*$%#@)%&$^$^$#^%$$%%");

        //B

        int[] column_Sums = new int[10];
        for(int c = 0;c<matrix1.length;c++){
            for(int r = 0;r<matrix1.length;r++){
                column_Sums [c] += matrix1[r][c];
            }
            //System.out.println("Column "+(c+1)+" sum: "+column_Sums[c]);
        }
        
        //C

        int[] row_Sums = new int[10];
        for(int r = 0; r<matrix1.length;r++){
            for(int c = 0;c<matrix1.length;c++){
                row_Sums [r] += matrix1[r][c];
            }
            //System.out.println("Row "+(r+1)+" sum: "+row_Sums[r]);
        }

        //D

        for(int dug = 0; dug<matrix1.length;dug++){
            System.out.println("Column "+(dug+1)+" sum: "+column_Sums[dug]+" || Row "+(dug+1)+" sum: "+row_Sums[dug]);
        }

    }
}
