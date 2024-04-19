import java.util.Scanner;

class two{
          
        public static void main (String []args){
        
	Scanner scan = new Scanner(System.in);
        char choice = 'y';

        while (choice == 'y'){
         System.out.println("Enter number:");
         int a = scan.nextInt();
         System.out.println("Enter number:");
         int b = scan.nextInt();
          scan.nextLine();
         System.out.println("Enter operator:");
         char operator = scan.nextLine().charAt(0);
          
         
         if (operator =='+')
         {
          int c=a+b;
         System.out.print(c);
         }  
         
	 else if (operator =='-')
         {
          int d=a-b;
         System.out.print(d);
         } 
         else if (operator =='*')
         {
          int e=a*b;
         System.out.print(e);
         }  
         else if (operator =='/')
         {
          int f=a/b;
         System.out.print(f);
         }  
          else if(operator =='%')
         {
          int g=a%b;
         System.out.print(g);
         }  
         scan.close();
	 }		
         System.out.println("Do you want to continue? (yes/no)");
            String input = scan.nextLine();
            if (input.length() > 0) {
                choice = input.charAt(0);
            } else {
                choice = 'n'; 
	}
}
}