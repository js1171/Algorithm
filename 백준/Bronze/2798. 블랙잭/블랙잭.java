import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardNum = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] cards = new int[cardNum];

        for (int i=0 ; i < cardNum ; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int max = 0;
        for (int i=0 ; i < cardNum-2 ; i++) {
            for (int j=i+1 ; j < cardNum-1 ; j++) {
                for(int k=j+1 ; k < cardNum ; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if(sum <= num) {
                        max = Math.max(sum, max);
                    }
                }
            }
        }
        System.out.println(max);
    }
}