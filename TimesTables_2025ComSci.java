public class TimesTables_2025ComSci {
    public static void main(String[] args) {
        int factor2 = 0;
        for(int row = 0;row<9;row++){
            factor2++;
            for(int factor1 = 1; factor1<10;factor1++){
                System.out.print(factor1+" * "+factor2+" = "+(factor1*factor2)+"\t");
            }
            System.out.println("");
        }
    }
}
