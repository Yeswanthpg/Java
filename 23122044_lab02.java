/*
 * ***************************************************************************
 * Name: YESWANTH P G
 * Register Number: 23122044
 * Class: 3MScDS A
 * Date : 04|04|2024
 * ***************************************************************************
 *                     Resturant Billing Application
 * You are going to create a JAVA program that runs in comand line for a Cafe.
 * That is aimed to track the billing of vairous items that has been sold for a
 * particular day.
 * 
 */
import java.util.Scanner;

class Restaurant{
    String[][] menu = {{"Idli-Sambar", "30"}, {"Tea", "10"}, {"Poori-Masala", "50"}, {"Coffee", "20"}, {"Parotta-Salna", "80"}, {"Dosa-Sambar-Chutney", "60"} };
    int[][] orders = {{2, 3}, {1, 2},{5, 6}, {4, 5}, {1,4}, {3, 6}};
    int Count = 6; 

    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + "." + menu[i][0] + " ₹ " + menu[i][1]);
        }
    }

    public void takeOrders() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of orders:");
        int order = scanner.nextInt();
        orders = new int[order][2];
        Count = order;

        System.out.println("Enter orders (item index quantity):");
        for (int i = 0; i < order; i++) {
            int items = scanner.nextInt();
            int quantity = scanner.nextInt();
            orders[i][0] = items;
            orders[i][1] = quantity;
        }
    }
    public void displayOrders() {
        System.out.println("Orders:");
        for (int i = 0; i < Count; i++) {
            System.out.print("Order " + (i + 1) + ": ");
            for (int j = 0; j < orders[i][1]; j++) {
                System.out.print(menu[orders[i][0] - 1][0] + ", ");
            }
            System.out.println();
        }
    }
    public void calculateBill() {
        int totalBill = 0;
        for (int i = 0; i < Count; i++) {
            int items = orders[i][0] - 1;
            int quantity = orders[i][1];
            int price = Integer.parseInt(menu[items][1]);
            totalBill += price * quantity;
        }
        System.out.println("Total Bill: ₹" + totalBill);
    }
    public float computeAmount(int[] itemsOrdered) {
        float totalAmount = 0;
        for (int i = 0; i < itemsOrdered.length; i++) {
            if (itemsOrdered[i] != 0) {
                totalAmount += Integer.parseInt(menu[itemsOrdered[i] - 1][1]);
            }
        }
        return totalAmount;
    }
    public void generateBill(Scanner scanner) {
        int[] itemsOrdered = new int[10];
        char ch = 'n';
        int counter = 0;
    
        do {
            displayMenu();
            System.out.println("Enter the item number you wish to order");
            int choice = Integer.parseInt(scanner.nextLine());
            itemsOrdered[counter] = choice;
            counter++;
    
            if (counter < 10) {
                System.out.println("Do you want to add another item to the order (Press y/Y for yes)");
                ch = scanner.nextLine().charAt(0);
            } else {
                ch = 'n';
            }
        } while (ch == 'Y' || ch == 'y');
    
        float billAmount = computeAmount(itemsOrdered);
        System.out.println("Total Bill Amount: " + billAmount);
        // Correctly adding the new order to the orders array
        orders[Count][0] = itemsOrdered[0];
        orders[Count][1] = itemsOrdered[1];
        Count++;
    }
    
    public void printTotalSales() {
        System.out.println("Total Sales:");
        for (int i = 0; i < Count; i++) {
            System.out.print("Order " + (i + 1) + ": ");
            for (int j = 0; j < 2; j++) { 
                if (orders[i][j] != 0) {
                    System.out.print(menu[orders[i][j] - 1][0] + ", ");
                }
            }
            System.out.println();
        }
    }
    
}

class Lab02 {
    static void welcomeCafe() {
       
        System.out.println("Welcome to Our Cafe!");
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        welcomeCafe();
        Restaurant myRestaurant = new Restaurant();

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print Menu");
            System.out.println("2. Generate Bill");
            System.out.println("3. Print Total Sales");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    myRestaurant.displayMenu();
                    break;
                case 2:
                    myRestaurant.generateBill(scanner);
                    break;
                case 3:
                    myRestaurant.printTotalSales();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println("Do you want to continue (Press Y/y to continue)?");
            ch = scanner.nextLine().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        System.out.println("Thank you for using our application!");
        scanner.close();
    }
}

