// write a program to find the palindrome of a number 
//  palindrome of 121 is  = 121 means  reverse of the number is = number .
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        
         System.out.println("Enter the Number : ");
         int n = sc.nextInt();
         int reverse = 0;
         int original = n;


         while(n!=0){
          
            int digit = n % 10;
             reverse = reverse * 10 + digit;
             n = n/10;  // number reverse krke check krenge ki original ke equal hai ki nhi 
         }

         if (original==reverse){
                System.out.println("Number is palindrome .");
         }
         else{
            System.out.println("Number is not palindrome .");
         }
         sc.close();
    }
}
