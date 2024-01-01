import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        double y = Math.sqrt( Math.pow(D,2) / ( 1+Math.pow(W,2)/Math.pow(H,2) ));
        double x = y * ((double) W /H);
        System.out.println((int)y + " " + (int)x);
    }
}