public class arrayDay3DoNow_2025ComSci {
    public static void main(String[] args) {
        String[] names = {"Kanye West", "Taylor Swift", "Aarush Nalamada", "Lebron James", "Donald J. Trump", "Dwayne Johnson", "Hugh Lawrie", "Will Smith", "Chris Rock", "Aryan Yerra"};
        String[] verbs = {" slaps ", " touches ", " punches ", " defeats ", " kicks ", " murders ", " eats ", " drinks ", " liquidifies ", " disintegrates "};
        
        int choice = (int)(Math.random()*10);
        int choice2 = (int)(Math.random()*10);
        int choice3 = (int)(Math.random()*10);

        System.out.println((names[choice])+(verbs[choice2])+(names[choice3]));
    }
}
