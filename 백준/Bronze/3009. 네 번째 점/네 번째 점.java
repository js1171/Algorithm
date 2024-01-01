import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] ax = new int[3];
        int[] ay = new int[3];

        for(int i=0 ; i<3 ; i++) {
            st = new StringTokenizer(br.readLine());
            ax[i] = Integer.parseInt(st.nextToken());
            ay[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(left(ax) + " " + left(ay));
    }

    public static int left(int[] arr) {
        int answer = 0;

        if(arr[0] == arr[1]) answer = arr[2];
        else if (arr[0] == arr[2]) answer = arr[1];
        else answer = arr[0];

        return answer;
    }
}