import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int last = sc.nextInt()+1;

        boolean[] sieve = new boolean[last];

        for (int i=2; i < last; i++) {
            sieve[i] = true;
        }

        for (int i=2; i*i < last ; i++) {
            if(sieve[i]) {
                for (int j = i*i; j < last; j+=i) {
                    sieve[j] = false;
                }
            }
        }

        for (int i=start; i < last; i++) {
            if(sieve[i]) {
                System.out.println(i);
            }
        }
    }
}