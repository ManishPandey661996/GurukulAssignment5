import java.util.Scanner;
class SumOfSeries{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println(" Enter the value of n : ");
        n = sc.nextInt();
        double sum=0.0;
        
        for ( int i=1 ; i <= n ; i++ ){
            sum= sum + (1.0/i);

        }
        System.out.printf(" %.5f ",sum);
        
    }
}