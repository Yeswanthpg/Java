import java.util.Scanner;

class prime {

        public static void main (String []args){
        
        Scanner scan = new Scanner(System.in);
             System.out.println("Enter number:");
             int a = scan.nextInt();
             if (a==2||a==3||a==5||a==7||a== 11||a== 13)
                System.out.println("Prime  number");

            else if( a% 2 == 0 ||a%3 == 0||a% 5==0||a% 7 ==0||a% 11==0||a% 13 ==0){
            System.out.println("not a prime number");
        }
            else if( a==1){
            System.out.println("neither prime nor composite");
         }
        else{
            System.out.println("Prime number");
        }
    
    }
}



