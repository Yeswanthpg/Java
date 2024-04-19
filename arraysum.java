import java.util.Scanner;

class arraySum {
    public static void main (String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Array size:");
        int n = scan.nextInt()
        int[] a = new int[n];
        
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

       
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        
        System.out.println("Sum of the array: " + sum);
    }
}
