import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        String[][] arr = new String[count][2];

        for(int i=0 ; i < count ; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = str[0];
            arr[i][1] = str[1];
        }

        StringTokenizer st;
        Arrays.sort(arr, new Comparator<String[]>() {
           @Override
           public int compare(String[] s1, String[] s2) {
               if(s1[0].equals(s2[0])) {
                   return 0;
               }
               else {
                   return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
               }
           }
        });

        for (int i=0 ; i < count ; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}