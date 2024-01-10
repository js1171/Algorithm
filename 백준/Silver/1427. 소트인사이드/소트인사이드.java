import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[str.length()];

        for(int i=0 ; i < str.length() ; i++) {
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }

        int c = 0;
        for(int i=0 ; i<str.length() ; i++) {
            int max = i;
            for(int j= i+1 ; j < str.length() ; j++) {
                if(arr[j] > arr[max]) {
                    max = j;
                }
            }
            if(arr[i] < arr[max]) {
                c = arr[i];
                arr[i] = arr[max];
                arr[max] = c;
            }
        }

        for(int i : arr) {
            System.out.print(i);
        }
    }
}