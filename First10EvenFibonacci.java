
class First10EvenFibonacci{
    public static void main(String[] args){
         int a =0 ,b=1 ,count =0;

        while ( count<10) {
            
            if (a % 2 == 0  )  { 
                System.out.print(a +" ");
                count++;
            }         
                
                
            int c = a+b;
            a=b;
            b=c;
        }
    }   

}
