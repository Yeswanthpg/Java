import java.util.Scanner;

class calc{
          
        public static void main (String []args){
        
	Scanner scan = new Scanner(System.in);
         System.out.println("Enter number:");
         int a = scan.nextInt();
         System.out.println("Enter number:");
         int b = scan.nextInt();
          scan.nextLine();
         System.out.println("Enter operator:");
         char op = scan.nextLine().charAt(0);
          
	if(op =='+')
	{
	int c=a+b;
	System.out.print(c);
	}
	else if(op =='-')
	{
	int d=a-b;
	System.out.print(d);
	}
	 else if (op =='*')
         {
          int e=a*b;
         System.out.print(e);
         }  
         else if (op =='/')
         {
          int f=a/b;
         System.out.print(f);
         }  
          else if(op =='%')
         {
          int g=a%b;
         System.out.print(g);
         }  
 	 else{
 	 System.out.print("invalid choice");
	}         
	scan.close();
	 }
}		
       
 