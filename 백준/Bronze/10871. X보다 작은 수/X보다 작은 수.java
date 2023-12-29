import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        int[] arr = new int[count];
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i < count ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : arr) {
            if(i < num) System.out.print(i + " ");
        }
    }
}