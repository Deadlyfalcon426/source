
public class forloops2_modsPart1__2025ComSci {
    public static int score(){
        return (int)((Math.random()*41)+60);
    }
    public static void main(String[] args) {
        System.out.print("How many scores would you like to input?\t");
        int z = 0;
        int g = 0;
        int good = 0;
        int mid = 0;
        int bad = 0;
        for(int t = 50;t>0;t--){
            z++;
            g = score();
            System.out.println("Test #"+z+":\t"+g);
            
            int y = 7;
            if (g<70){
                bad++;
            }
            else if (g>69 && g<90){
                mid++;
            }
            else if (g>89 && g<101){
                good++;
            }
            else{
                System.out.println("Bro just write a number its not that deep!!");
            }
        }
        System.out.println("Outstanding Scores: "+good+"\n");
        System.out.println("Satisfactory Scores: "+mid+"\n");
        System.out.println("Unsatisfactory Scores: "+bad+"\n");
    }
}
