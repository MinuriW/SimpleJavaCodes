public class StringlengthWithoutFunction {
    public static void main(String [] args){
        String s = "Hello";
        int count = 0;
        char ch[] = s.toCharArray();

        for(char c : ch){
            count++;
        }
        System.out.println("Length =" + count);
    }
}
