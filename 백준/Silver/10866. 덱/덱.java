import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int listCount = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();
        int answerCount = 0;
        // 333 10
        for (int i=1 ; i <= listCount ; i++) {
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "push_front" : deque.addFirst(Integer.parseInt(st.nextToken())); break;
                case "push_back" : deque.addLast(Integer.parseInt(st.nextToken())); break;
                case "pop_front" :
                    if (!deque.isEmpty()) {
                        answer.add(deque.pollFirst());
                    }
                    else answer.add(-1);
                    break;
                case "pop_back" :
                    if (!deque.isEmpty()) {
                        answer.add(deque.pollLast());
                    }
                    else answer.add(-1);
                    break;
                case "size" : answer.add(deque.size()); break;
                case "empty" : answer.add(deque.isEmpty() ? 1 : 0); break;
                case "front" :
                    if (!deque.isEmpty()) {
                        answer.add(deque.peekFirst());
                    }
                    else answer.add(-1);
                    break;
                case "back" :
                    if (!deque.isEmpty()) {
                        answer.add(deque.peekLast());
                    }
                    else answer.add(-1);
                    break;
            }
        }
        for(int i=0 ; i <answer.size() ; i++) {
            System.out.println(answer.get(i));
        }
    }
}