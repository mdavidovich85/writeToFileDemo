/**
 * Created by MDavidovich on 7/23/16.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Davidovich_A04Q2 {

    // This program accepts string inputs from a user and writes them to a file until
    // the user enters the string value DONE.  The file is created without the string value
    // DONE.

    public static void main(String[] args) throws IOException {

        String file = "userStrings.txt";                // Name of filed that is to be created
        PrintWriter outFile = new PrintWriter(file);    // Allows printing to the file
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println();

        while (!input.equals("DONE")) {                 //  As long as input does not equal "DONE"
            outFile.println(input);                     //  the program will contiune to write to the file.
            outFile.println();
            input = scan.nextLine();
            System.out.println();
        }
        outFile.close();                                // Creates file.
        System.out.print("Output file as been created " + file);    // Confirms to user file is created.  
    }
}


