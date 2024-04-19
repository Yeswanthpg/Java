import java.util.Scanner;

class Lab1 {
    int sum = 0;
    int count = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    boolean n = false;
    int m = 0;

    public static void main(String[] args) {
        Lab1 lab = new Lab1();
        lab.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                   i(scanner);
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    printStats();
                    break;
                case 4:
                    resetToZero();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                case 6:
                    clearScreen();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    public void displayMenu() {
        System.out.println("****MENU****");
        System.out.println("1. Enter Number");
        System.out.println("2. View Last Entered Number");
        System.out.println("3. Print Stats");
        System.out.println("4. Reset to Zero");
        System.out.println("5. Exit");
        System.out.println("6. Clear Screen");
        System.out.println("Enter your choice:");
    }

    public void i(Scanner scanner) {
        System.out.println("Enter a Number:");
        int i = scanner.nextInt();
        sum +=i;
        count++;

        if (!n ||i < min) {
            min =i;
            n = true;
        }
        if (!n ||i > max) {
            max =i;
            n = true;
        }
        m =i;
    }

    public void view() {
        if (count > 0) {
            System.out.println("Last Entered Number: " + m);
        } else {
            System.out.println("Nois entered yet.");
        }
    }

    public void printStats() {
        if (count > 0) {
            System.out.println("Sum: " + sum);
            System.out.println("Mean: " + (float) sum / count);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        } else {
            System.out.println("Nois entered yet.");
        }
    }

    public void resetToZero() {
        sum = 0;
        count = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        n = false;
        m = 0;
        System.out.println("Reset to zero.");
    }

    public void clearScreen() {
        System.out.println("Screen cleared.");
    }
}
