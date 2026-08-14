//check if numbe is prime number or not 
import java.util.Scanner;

public class prime {
     
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the number : ");
         int n = sc.nextInt();
  

         if(n<=1){
             System.out.println("Number is not a  prime number .");
        return;
     }
        
         for (int i=2; i<n ; i++){
            if (n % i == 0){
               System.out.println("Number is not a prime number .");
             return;
             }
         }    
    
     System.out.println("Number is a prime Number . ");
     
     sc.close();
    }
}
