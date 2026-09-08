// what is armstrong number -   armstrong is a number where the sum  of  eaacg digit raised to tge power of the number of digits is equal lto the original number . 



     // basically if we have 1^3+5^3+3^3 = 153    its a armstrong number 


     import java.util.Scanner;

     public class armstorng{

          public static void main(String [] args ){
              

               Scanner  sc = new Scanner (System.in);


               System.out.println("Enter the number : ");
               int n = sc.nextInt();
               int sum = 0;
               int orignal = n;


               while( n > 0 ){
                  int digit= n % 10 ;
                   
                  sum = sum + digit*digit*digit;

                  n = n/10;

               }


               if (orignal==sum){

                    System.out.println(" Yes !!  Its a Armstrong number . "); 
               }
      else{
          System.out.println("number is not a armstrong number .");
      }

               sc.close();
          }



     }
