
// wap to calculate the power b^p result .





import java.util.Scanner;
        public  class power{
            
            void powermethod(int b,int p){
              int  result=1;
                    for(int i=1;i<=p;i++){
                    result= result*b;
                    }
                
              System.out.println("Value  is  : "+result);

        
    }

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

                    System.out.println("Enter the Base value :  ");
                    int b = sc.nextInt();

                    System.out.println("Enter the power value :  ");
                    int p = sc.nextInt();

                    power obj = new power();

                obj.powermethod(b,p);


            sc.close();
        }
    }