import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());

        for(int i=1 ; i <= num1 ; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int num2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i=0 ; i<num2 ; i++) {
            if (set.contains(Integer.parseInt(st.nextToken()))) System.out.println(1);
            else System.out.println(0);
        }
    }
}