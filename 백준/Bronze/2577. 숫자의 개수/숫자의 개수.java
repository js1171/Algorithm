import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        int[] arr = new int[10];

        for (int i = 0 ; i < 3 ; i++) {
            num *= Integer.parseInt(br.readLine());
        }

        String strNum = num + "";
        for (int i = 0 ; i < strNum.length() ; i++) {
            arr[Integer.parseInt(strNum.substring(i, i + 1))]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}