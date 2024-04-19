import java.util.Scanner;

class week{
          
        public static void main (String []args){
        
	Scanner scan = new Scanner(System.in);
         System.out.println("Enter number");
         int w = scan.nextInt();
    
         if (w == 1)
         {
         System.out.print("monday");
         }  
         
	 else if (w == 2)
         {
         System.out.print("tuesday");
         } 
         else if (w == 3)
         {
          
         System.out.print("wednesday");
         }  
         else if (w == 4)
         {
         System.out.print("thrusday");
         }  
          else if(w == 5)
         {
         System.out.print("friday");
         }
           else if(w == 6)
         {
         System.out.print("saturday");
         }
         else if(w == 7)
         {
         System.out.print("sunday");
         } 
         else
         {
 	   System.out.print("invalid number");
}
scan.close();
}
}		
