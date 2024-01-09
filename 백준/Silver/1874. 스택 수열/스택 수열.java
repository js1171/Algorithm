import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int addNum = 1;
        boolean flag = true;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=1 ; i <= count ; i++) {
            int in = Integer.parseInt(br.readLine());
            if(in >= addNum) {
                while(in >= addNum) {
                    stack.push(addNum++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                if(!stack.isEmpty() && stack.peek() > in){
                    System.out.println("NO");
                    flag = false;
                    break;
                }
                else {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                    sb.append("-\n");
                }
            }
        }
        if(flag) System.out.println(sb);
    }
}