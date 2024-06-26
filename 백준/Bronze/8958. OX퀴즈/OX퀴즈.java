import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcNum = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 0 ; tc < tcNum ; tc++) {
            String str = br.readLine();
            int plusNum = 1;
            int result = 0;
            for (int i = 0 ; i < str.length() ; i++) {
                String ox = str.substring(i, i + 1);
                if (ox.equals("O")) {
                    result += plusNum++;
                } else {
                    plusNum = 1;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}