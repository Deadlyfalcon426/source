import java.util.Scanner;
public class ParallelArrays1 {
    
    public static void main(String[]args) {
    Scanner read = new Scanner(System.in);
        
    int[] number = new int[5];
    String[] street = new String[5];
    char[] apt = new char[5];
    String[] zipcode = new String[5];

    for(int i = 0; i < number.length; i++){
    System.out.println("Address #" + (i+1));
    System.out.print("Enter the address number:  ");
        number[i] = read.nextInt(); read.nextLine();
    System.out.print("Enter street:  ");
    street[i] = read.nextLine();
            System.out.print("Enter Apartment (\"-\" if N/A)  ");
    apt[i] = read.next().charAt(0);  read.nextLine();
    System.out.print("Enter zipcode:  ");
    zipcode[i] = read.nextLine();
}

    for(int i = 0; i < number.length; i++) {
  System.out.print(number[i]+" "+street[i]+" ");
      if(apt[i] != '-'){
        System.out.print("Apartment " + apt[i]+" ");
            }
  System.out.println(zipcode[i]);
        }

        //task 2

        String[] firstName = new String[6];
        char[] lastInitial = new char[6];
        String[] studentNumber = new String[6];
        int[] pointsEarned = new int[6];
        int[] pointsPossible = new int[6];
        double[] percentage =  new double[6];

        for(int i = 0; i < 6; i++){
            System.out.println("Student #" + (i+1));
            System.out.print("Enter Name:\t");
            firstName[i] = read.nextLine();
            System.out.print("Enter first letter of last name:\t");
            lastInitial[i] = read.next().charAt(0); read.nextLine();
            System.out.print("Enter Student Number:\t");
            studentNumber[i] = read.nextLine();
            System.out.print("Enter Points Earned: ");
            pointsEarned[i] = read.nextInt();
            System.out.print("Enter Points Possible: ");
            pointsPossible[i] = read.nextInt();
            percentage[i] = (((double)pointsEarned[i])/pointsPossible[i])*100;
        }

        for(int i = 0; i < firstName.length; i++){
            System.out.println(firstName[i]+" "+lastInitial[i]+" "+studentNumber[i]+" "+pointsEarned[i]+" "+pointsPossible[i]+" "+percentage[i]+"%");
        }
        //task 3
        String[] names = {
            "Tom Holland", "Zendaya", "Timothée Chalamet", "Millie Bobby Brown", "Selena Gomez",
            "Justin Bieber", "Ariana Grande", "Billie Eilish", "Harry Styles", "Taylor Swift"
    };
    double[] heights = {
            1.78, 1.78, 1.78, 1.61, 1.65,
            1.75, 1.52, 1.60, 1.83, 1.78
    };
    int[] ages = {
            27, 26, 27, 19, 30,
            29, 30, 21, 29, 33
    };
    System.out.println("Celebrity Data:");
    for (int i = 0; i < names.length; i++) {
        System.out.println("Name: " + names[i] + ", Height: " + heights[i] + "m, Age: " + ages[i]);
    }

    int tallestIndex = 0;
    for (int i = 1; i < heights.length; i++) {
        if (heights[i] > heights[tallestIndex]) {
            tallestIndex = i;
        }
    }
    System.out.println("");
    System.out.println("The tallest celebrity is:");
    System.out.println("Name: " + names[tallestIndex] + ", Height: " + heights[tallestIndex] + "m, Age: " + ages[tallestIndex]);
}

    }



