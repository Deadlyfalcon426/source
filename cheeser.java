import java.util.Scanner;

public class cheeser {
    public static void main (String[]args){
        String[] titles = {"Game of Thrones", "Breaking Bad", "The Walking Dead", "Supernatural", "FRIENDS", 
                           "Doctor Who", "Black Mirror", "The Simpsons", "The Big Bang Theory", "How I Met Your Mother"};
        int[] seasons = {8, 5, 10, 15, 10, 12, 5, 31, 12, 9};
        int[] episodes = {73, 62, 144, 319, 236, 156, 22, 676, 281, 208};
        int[] wins = {313, 138, 69, 22, 71, 113, 23, 173, 67, 25};
        int[] nominations = {505, 217, 195, 85, 211, 195, 75, 309, 236, 90};
        double[] ratings = {8.8, 9.0, 8.1, 8.5, 8.5, 7.7, 7.9, 7.2, 7.9, 8.2};
        int[] startYears = {2011, 2008, 2010, 2005, 1994, 2005, 2011, 1989, 2007, 2005};
        int[] endYears = {2019, 2013, 2020, 2020, 2004, 2020, 2020, 2025, 2019, 2014};
        
        // Available stats
        String[] stats = {"Seasons", "Episodes", "Wins", "Nominations", "Rating", "Start Year", "End Year"};

        // Introductory message
        System.out.println("The following shows have been stored in the array:");
        System.out.print("[");
        for (int i = 0; i<titles.length;i++) {
            System.out.print(titles[i]+", ");
        }
        System.out.println("]");
        System.out.println("");

        System.out.println("\nThe following stats are available for selection:");
        System.out.print("[");
        for (int i = 0; i<stats.length;i++) {
            System.out.print(stats[i]+", ");
        }
        System.out.println("]");
        System.out.println("");

        System.out.println("\nType \"quit\" to end the program.\n");

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get the show's name
            System.out.print("Which show's stats would you like to research? ");
            String showName = scanner.nextLine().trim();
            if (showName.equalsIgnoreCase("quit")) {
                break;
            }

            // Get the stat
            System.out.print("Which stat would you like? ");
            String statName = scanner.nextLine().trim();

            // Find the show index
            int showIndex = -1;
            for (int i = 0; i < titles.length; i++) {
                if (titles[i].equalsIgnoreCase(showName)) {
                    showIndex = i;
                    break;
                }
            }

            if (showIndex == -1) {
                System.out.println("Show not found. Please choose a valid show.");
                continue;
            }

            // Output the requested stat
            switch (statName.toLowerCase()) {
                case "seasons":
                    System.out.println(titles[showIndex] + " has " + seasons[showIndex] + " seasons.");
                    break;
                case "episodes":
                    System.out.println(titles[showIndex] + " has aired " + episodes[showIndex] + " episodes.");
                    break;
                case "wins":
                    System.out.println(titles[showIndex] + " has won " + wins[showIndex] + " awards.");
                    break;
                case "nominations":
                    System.out.println(titles[showIndex] + " has " + nominations[showIndex] + " nominations.");
                    break;
                case "rating":
                    System.out.println(titles[showIndex] + " has an average rating of " + ratings[showIndex] + ".");
                    break;
                case "start year":
                    System.out.println(titles[showIndex] + " started airing in " + startYears[showIndex] + ".");
                    break;
                case "end year":
                    System.out.println(titles[showIndex] + " ended airing in " + endYears[showIndex] + ".");
                    break;
                default:
                    System.out.println("Stat not found. Please choose a valid stat.");
            }
        }

        System.out.println("Program ended.");
    }
}
