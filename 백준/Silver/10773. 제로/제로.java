import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i=1 ; i <= count ; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                stack.push(num);
            }
            else stack.pop();
        }

        int answer = 0;
        for (int i : stack) {
            answer += i;
        }
        System.out.println(answer);
    }
}