import java.util.Scanner;

class weeks{
          
        public static void main (String []args){
        
	Scanner scan = new Scanner(System.in);
         System.out.println("Enter number");
         int w = scan.nextInt();
          
         switch(w){

         case 1:
         {
         System.out.print("monday");
          break;
         }  
         
	 case 2:
         {
         System.out.print("tuesday");
          break;
         } 
         case 3:
         {
          
         System.out.print("wednesday");
          break;
         }  
         case 4:
         {
         System.out.print("thrusday"); 
           break;
         }  
          case 5:
         {
         System.out.print("friday");
          break;
         }
           case 6:
         {
         System.out.print("saturday");
            break;
        }
         case 7:
         {
         System.out.print("sunday");
            break;        
} 
         default:
	 {
         
 	   System.out.print("invalid number");
}
scan.close();
}
}
}		
