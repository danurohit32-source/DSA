// WAP  to Reverse a Given Number by User


import java.util.Scanner; 
public class reverse {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Enter the Number : ");
    int n = sc.nextInt();     
    int reverse=0;
    int original=n;
   

      // logic - first we will get the last digit of the number 
      // then we will save that number 

        while(n != 0){
            int digit= n % 10 ;
            reverse = reverse * 10 + digit;
             // existing reverse number ko ek digit left shift krke original number ka last digi add krta hai .
            n = n / 10 ; // to remove last digit .
            }

    System.out.println("Orignal Number  : "+ original); 
    System.out.println("Reversed Number : "+ reverse);   
    sc.close();
}
}
