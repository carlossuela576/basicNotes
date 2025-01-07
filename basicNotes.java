import java.util.Scanner;

public class basicNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //welcome prompts
        System.out.println("Welcome to Basic Notes!");
        //user input for the number of notes
        System.out.print("How many items would you like to enter?: ");
        int rowItems = sc.nextInt();

        //error occurs without this, consumes the next line
        //without this the program will skip the first input
        sc.nextLine();

        //initialize dynamic rows
        String[][] notes = new String[rowItems][2];
        //prompt user to enter their notes
        System.out.println("Please enter your notes below.");

        //loop array initialization
        for (int i = 0; i < notes.length; i++){
            for (int j = 0; j < notes[i].length; j++){
                System.out.println("Enter note " + (i + 1) + ": ");
                notes[i][j] = sc.nextLine();
            }
        }

        //loop through the array and print the notes
        System.out.println("-----------------------------------");
        System.out.println("HERE ARE THE NOTES YOU'VE ENTERED");
        System.out.println("-----------------------------------");

        for (int row = 0; row < notes.length; row++) {
            System.out.println();
            for (int colu = 0; colu < notes[row].length; colu++) {
                System.out.println(notes[row][colu] + " ");
            }
        }
    }
}