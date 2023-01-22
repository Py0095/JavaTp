import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        int tableSize = 0;
        int talevalue;
        int[] table = new int[tableSize];
        Scanner keyboard = new Scanner(System.in);

        System.out.print("[1]Please enter a value for create the dimension of the table:");
        tableSize = keyboard.nextInt();
        table = new int[tableSize];

        if (tableSize <= 3 || tableSize >= 7) {
            while (tableSize <= 3 || tableSize >= 7) {
                System.out.println("[1]Please you must enter a value betwen this interval[3,7].");
                tableSize = keyboard.nextInt();
                table = new int[tableSize];
            }

        }

        System.out.println("");

        for (int i = 0; i < tableSize; i++) {
            System.out.print("Please enter the value number #" + (i + 1) + ':');
            table[i] = keyboard.nextInt();
        }

        System.out.println("");

        System.out.println("The numbers you entered are:");
        for (int i = 0; i < tableSize; i++) {
            System.out.println("Element #" + (i + 1) + ":" + table[i]);
        }

        System.out.println("");

        System.out.println("the last three numbers are:");
        for (int i = 4; i > 1; i--) {
            System.out.println("Element #" + ((tableSize - i) + 2) + ":" + table[(tableSize - i) + 1]);
        }

        // System.out.println("the first three numbers are:");
        // for (int i = 4; i > 1; i--) {
        // System.out.println("Element #" + ((tableSize-i)+2) + ":" +
        // table[(tableSize-i)+1]);
        // }

        int min = 0;
        int max = 0;
        for (int i = 0; i< tableSize;  i++) {
            if (table[i] < min)
                min = table[i];
            if(table[i]>max)
                max = table[i];

        }
        System.out.println("");
        System.out.println("The biggest number in the array: "+max);
        System.out.println("The smaller number in the array: "+min);


    }

}
