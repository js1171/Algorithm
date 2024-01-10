import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[] arr = new int[count];

        for(int i=0 ; i < count ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int c = 0;
        for(int i=0 ; i < count-1 ; i++) {
            for(int j=0 ; j < count-1-i ; j++) {
                if(arr[j+1] < arr[j]) {
                    c =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
            }
        }
        for(int i : arr) {
            System.out.println(i);
        }
    }
}