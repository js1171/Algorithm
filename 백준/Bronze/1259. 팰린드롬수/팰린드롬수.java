import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = "";
        StringBuilder answer = new StringBuilder();

        while(!(st=br.readLine()).equals("0")) {
            StringBuilder sb = new StringBuilder();
            if(st.contentEquals(sb.append(st).reverse())) {
                answer.append("yes");
            } else {
                answer.append("no");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}