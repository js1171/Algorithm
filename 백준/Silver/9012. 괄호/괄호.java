import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String[] arr = new String[count];
        int index = 0;

        for (int i=1 ; i <=count ; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            for(int j=0 ; j < str.length(); j++) {
                if(str.charAt(j)=='(') stack.push(str.charAt(j));
                else if (str.charAt(j)==')' && stack.isEmpty()) {stack.push(str.charAt(j)); break;}
                else if (str.charAt(j)==')' && !stack.isEmpty()) stack.pop();

            }
            arr[index++] = stack.isEmpty() ? "YES" : "NO";
        }

        for (String str : arr) {
            System.out.println(str);
        }
    }
}