import java.util.Scanner;

class HighestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Finding highest number
        if (a >= b && a >= c) {
            System.out.println("Highest number is: " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Highest number is: " + b);
        } 
        else {
            System.out.println("Highest number is: " + c);
        }

        sc.close();
    }
}