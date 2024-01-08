import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrSize = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[arrSize];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0 ; i < arrSize ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int startIndex = 0;
        int endIndex = arrSize-1;
        int sum = 0;
        int count = 0;

        while(startIndex < endIndex) {
            sum = arr[startIndex] + arr[endIndex];
            if(sum == N) {
                count++;
                startIndex++;
                endIndex--;
            }
            else if (sum < N) {
                startIndex++;
            }
            else {
                endIndex--;
            }
        }
        System.out.println(count);
    }
}