import java.util.Scanner;
class Fibbnocci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int upperLimit , lowerLimit;
        System.out.println(" Enter the lower limit");
        lowerLimit =sc.nextInt();
        System.out.println(" Enter the upper limit");
        upperLimit = sc.nextInt();
        int a =0 ,b=1 ;
        while (a<= upperLimit ){
            if(a>= lowerLimit ){
                System.out.print(a +" ");
            }
            int c = a+b;
            a=b;
            b=c;
          
            
             
        }
    }
}