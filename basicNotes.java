import java.util.Scanner;

public class basicNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //welcome prompts
        System.out.println("Welcome to Basic Notes!");
        //user input for the number of notes
        System.out.print("How many items would you like to enter?: ");
        int columnIt = sc.nextInt();

        //error occurs without this, consumes the next line
        //without this the program will skip the first input
        sc.nextLine();

        //initialize dynamic column
        String [] title = new String[columnIt];
        String [] notes = new String[columnIt];
        //prompt user to enter their notes
        System.out.println("Please enter your notes below.");

        //loop array initialization
        for (int i = 0; i < columnIt; i++){
            System.out.println("Enter title");
            System.out.print((i+1) + ". ");
            title[i] = sc.nextLine().toUpperCase();

            System.out.println("Enter note");
            System.out.print((i+1) + ". ");
            notes[i] = sc.nextLine();
        }

        //loop through the array and print the notes
        System.out.println("-----------------------------------");
        System.out.println("HERE ARE THE NOTES YOU'VE ENTERED");
        System.out.println("-----------------------------------");

        for (int row = 0; row < columnIt; row++){
            System.out.println("note " + (row+1));
            System.out.println(title[row]);
            System.out.println(notes[row]);
            System.out.println();
        }
    }
}