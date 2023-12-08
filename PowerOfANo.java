import java.util.Scanner;
class PowerOfANo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print(" Enter the no : ");
        a = sc.nextInt();
        System.out.print(" Enter the power on no : ");
        b = sc.nextInt();

        int result=1;

        for (int i =0 ; i < b ; i++ ){
            result = result * a;
        }

        System.out.print(" result : "+ result);
    }
}