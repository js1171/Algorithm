import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i=1 ; i <=count ; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push" : stack.push(Integer.parseInt(st.nextToken())); break;
                case "pop" : sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); break;
                case "size" : sb.append(stack.size()).append("\n"); break;
                case "empty" : sb.append(stack.isEmpty() ? 1 : 0).append("\n"); break;
                case "top" : sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); break;
            }
        }
        System.out.println(sb);
    }
}