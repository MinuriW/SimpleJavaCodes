public class NumberPyramid {
    public static void main(String[] args){
    int num;

    int n =5; //num of rows

    for(int i=0; i<n; i++)
    {
        num=1;

        for(int j=0; j<=i; j++)
        {

            System.out.print(num+ " ");

            num++;
        }

        System.out.println();
    }
}
}
