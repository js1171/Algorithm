import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        double max = 0;

        int[] arr = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0 ; i < count ; i++) {
            int num = Integer.parseInt(st.nextToken());
            max = Math.max(max, num);
            arr[i] = num;
        }

        double score = 0;
        for(int i : arr) {
            score += (i/max)*100;
        }
        System.out.println(score/count);
    }
}