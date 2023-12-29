import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder asb = new StringBuilder();
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=count ; i++) {
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j=0 ; j < str.length() ; j++) {
                asb.append(String.valueOf(str.charAt(j)).repeat(num));
            }
            asb.append("\n");
        }
        System.out.println(asb);
    }
}