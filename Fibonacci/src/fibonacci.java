public class fibonacci {
   public static void main(String[] args){
       //1 1 2 3 5 8 13 21 34

       int n = 10;
       int r=0, a=1, b=1;

       System.out.print(a + " " +b);

       while(r <= n){
           r=a+b;
           if(r>=n){
               break;
           }
           System.out.print(" "+ r);

           a=b;
           b=r;
       }

    }


}
