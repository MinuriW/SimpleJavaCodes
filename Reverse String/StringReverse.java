import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array");
        String str = br.readLine();
        char[] arr  = str.toCharArray();

        String reverse = "";

        for(int i=arr.length-1; i>=0; i--) {
            reverse += arr[i];

        }

        System.out.print(reverse);
    }
}
