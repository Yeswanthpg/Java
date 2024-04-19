import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of students");
        int n = scan.nextInt();
        scan.nextLine(); // Consume newline left-over
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name = scan.nextLine();
            System.out.println("Enter your age:");
            int age = scan.nextInt();
            scan.nextLine(); // Consume newline left-over
            System.out.println("Enter your dept:");
            String dept = scan.nextLine();
            System.out.println("Enter your regno:");
            int regno = scan.nextInt();
            scan.nextLine(); // Consume newline left-over
            
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Dept: " + dept);
            System.out.println("Regno: " + regno);
        }
        
        // Close the scanner after the loop
        scan.close();
    }
}
