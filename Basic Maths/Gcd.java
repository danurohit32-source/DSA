import java.util.Scanner;


            public class Gcd {

               static  int gcd(int  a,int b ){ // kyuki main  static hai to hu  is bhi static clas bnayenge  jisse  hume gcd ka object bnanne ki jrrut nhi hai.
                                  while(b!=0){
                                int temp = b;

                                  b=a%b;
                                 a = temp;
                                  }
                                  return a;
                }

                public static void main(String[] args) {
                       Scanner sc  = new Scanner (System.in);

                       System.out.println("Enter frist number : ");
                       int a = sc.nextInt();

                       System.out.println("Enter the second number : ");
                       int b = sc.nextInt();

                       System.out.println("GCD = "+ gcd(a,b));
                     sc.close();
                }
    
}
