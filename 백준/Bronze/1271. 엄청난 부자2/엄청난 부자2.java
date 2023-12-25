import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger money = new BigInteger(st.nextToken());
        BigInteger people = new BigInteger(st.nextToken());

        System.out.println(money.divide(people));
        System.out.println(money.remainder(people));
    }
}