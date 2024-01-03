import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine())-1;
        int count=1;
        if (num==0) System.out.println(1);
        else {
            while (num > 0) {
                num -= (6 * count);
                if (num > 0) count++;
            }
            System.out.println(count+1);
        }
    }
}