
import java.util.Scanner;

import Exo.Exo1;
import Exo.Exo2;
import Exo.Exo3;

public class TPIntra {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args){
        int choice;
        
        do {
            printMenu();

            // Get the user choice
            System.out.print("OPTION >>> ");
            choice = sc.nextInt();
            System.out.println("\n");

            // User Choice Switch
            switch (choice) {
                case 1:
                    Exo1.run();
                    break;
                case 2:
                    Exo2.run();
                    break;
                case 3:
                    Exo3.run();
                    break;
                case 0:
                    System.out.println("\n\n** Great TP\n\n");
                    return;
                default:
                    System.out.println("** Invalid Option. Please try again.");
                    break;
            }

            System.out.print("\nEnter to Continue ...");
            sc.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
        } while (true);
    }

    private static void printMenu() {
        System.out.println("1. EXO1");
        System.out.println("2. EXO2");
        System.out.println("3. EXO3");
        System.out.println("0. Exit");
    }
}
