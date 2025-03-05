

public class Chessboard_2025ComSci {
    public static void main (String[]args) {
        String[][] spaces = new String[8][8];
        //fill array
        for(int i = 0; i<spaces.length; i++){
            for(int z = 0; z<spaces.length; z++){
                spaces[i][z] = "-";
            }
        }
        //randomizers 

        //  randomizer for A
        int Ax = (int)(Math.random()*8);
        int Ay = (int)(Math.random()*8);
        spaces[Ax][Ay] = "A";
        //  randomizer for B
        int Bx = (int)(Math.random()*8);
        int By = (int)(Math.random()*8);
        int binary = 0;
        while (binary == 0){
            if (Ax == Bx && Ay == By){
                binary = 0;
                Bx = (int)(Math.random()*8);
                By = (int)(Math.random()*8);
            }
            else{
                binary = 1;
            }
        }
        spaces[Bx][By] = "B";
        //  randomizer for C
        int Cx = (int)(Math.random()*8);
        int Cy = (int)(Math.random()*8);
        binary = 0;
        while (binary == 0){
            if (Ax == Cx && Ay == Cy){
                binary = 0;
                Cx = (int)(Math.random()*8);
                Cy = (int)(Math.random()*8);
            }
            else if (Bx == Cx && By == Cy){
                binary = 0;
                Cx = (int)(Math.random()*8);
                Cy = (int)(Math.random()*8);
            }
            else{
                binary = 1;
            }
        }
        spaces[Cx][Cy] = "C";
        //  randomizer for Q
        int Qx = (int)(Math.random()*8);
        int Qy = (int)(Math.random()*8);
        binary = 0;
        while (binary == 0){
            if (Ax == Qx && Ay == Qy){
                binary = 0;
                Qx = (int)(Math.random()*8);
                Qy = (int)(Math.random()*8);
            }
            else if (Bx == Qx && By == Qy){
                binary = 0;
                Qx = (int)(Math.random()*8);
                Qy = (int)(Math.random()*8);
            }
            else if (Cx == Qx && Cy == Qy) {
                binary = 0;
                Qx = (int)(Math.random()*8);
                Qy = (int)(Math.random()*8);
            }
            else{
                binary = 1;
            }
        }
        spaces[Qx][Qy] = "Q";

        //print out 
        for(int i = 0; i<spaces.length; i++){
            for(int z = 0; z<spaces.length; z++){
                System.out.print(spaces[i][z]+"  ");
            }
            System.out.println("");
        }
        //can queen hit?

        //  weirdo ahh function
        int Aslope = 0;
        Aslope = ((Ay-Qy)/(Ax-Qx));
        int Bslope = 0;
        Bslope = ((By-Qy)/(Bx-Qy));
        int Cslope = 0;
        Cslope = ((Cy-Qy)/(Cx-Qx));
        int ConfirmA = 0;
        int ConfirmB = 0;
        int ConfirmC = 0;
        if ((Aslope == -1) || (Aslope == 1)){
            ConfirmA++;
        }
        if ((Bslope == -1) || (Bslope == 1)){
            ConfirmB++;
        }
        if ((Cslope == -1) || (Cslope == 1)){
            ConfirmC++;
        }

        //  outputs and basic x/y movement
        if (Qx == Ax || Qy == Ay || ConfirmA == 1){
            System.out.println("A can be reached by the queen.");
        }
        if (Qx == Bx || Qy == By || ConfirmB == 1){
            System.out.println("B can be reached by the queen.");
        }
        if (Qx == Cx || Qy == Qx || ConfirmC == 1){
            System.out.println("C can be reached by the queen.");
        }
        
    }
}
