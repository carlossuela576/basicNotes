import java.util.Scanner;

public class basicNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //welcome prompts
        System.out.println("Welcome to Basic Notes!");
        //initialize a 2 row and 5 column array
        String[][] notes = new String[5][2];    //2 rows and 5 columns
        //prompt user to enter their notes
        System.out.println("Please enter your notes below.");

        //manual initialization of the array
        //quite inefficient, but it's just for demonstration purposes ;)
        
        //note 1
        System.out.print("Enter Title 1: ");
        notes[0][0] = sc.nextLine();
        System.out.print("Enter note 1: ");
        notes[0][1] = sc.nextLine();
        //note 2
        System.out.print("Enter Title 2: ");
        notes[1][0] = sc.nextLine();
        System.out.print("Enter note 2: ");
        notes[1][1] = sc.nextLine();
        //note 3
        System.out.print("Enter Title 3: ");
        notes[2][0] = sc.nextLine();
        System.out.print("Enter note 3: ");
        notes[2][1] = sc.nextLine();
        //note 4
        System.out.print("Enter Title 4: ");
        notes[3][0] = sc.nextLine();
        System.out.print("Enter note 4: ");
        notes[3][1] = sc.nextLine();
        //note 5
        System.out.print("Enter Title 5: ");
        notes[4][0] = sc.nextLine();
        System.out.print("Enter note 5: ");
        notes[4][1] = sc.nextLine();

        //loop through the array and print the notes
        System.out.println("-----------------------------------");
        System.out.println("HERE ARE THE NOTES YOU'VE ENTERED");
        System.out.println("-----------------------------------");

        for (int i = 0; i < notes.length; i++) {
            System.out.println();
            for (int j = 0; j < notes[i].length; j++) {
                System.out.println(notes[i][j] + " ");
            }
        }
    }
}