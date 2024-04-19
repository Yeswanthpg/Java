import java.util.Scanner;

public class array2d {
    
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[][] arr =new int[2][3];
    System.out.println("Array size:");
    for(int i=0;i<2;i++){
        for(int j=0; j<3;j++){
            System.out.println(arr[i][j]+"");
        }
        System.out.println("");

    }
} 
}
