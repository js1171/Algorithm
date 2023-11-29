import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        while(true) {
            int start = sc.nextInt();
            if(start!=0) {
                list.add(start);
            }
            else {
                break;
            }
        }

        for (int i=0 ; i < list.size() ; i++ ){

            int start = list.get(i);
            int last = start*2+1;
            int count = 0;

            boolean[] sieve = new boolean[last];

            for (int fi=2 ; fi < last ; fi++) {
                sieve[fi] = true;
            }

            for (int fi=2 ; fi*fi < last ; fi++) {
                for (int j=fi*fi ; j < last ; j +=fi) {
                    sieve[j] = false;
                }
            }

            for (int fi=start+1 ; fi < last ; fi++) {
                if (sieve[fi]) count++;
            }
        System.out.println(count);
        }
    }
}