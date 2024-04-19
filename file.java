import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
         try {
            FileWriter fileWriter = new FileWriter("multiplication_table.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                printWriter.println(number + " x " + i + " = " + result);
            }

            printWriter.close();
            System.out.println("Multiplication table saved to multiplication_table.txt");
        } catch (Exception exception ) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}