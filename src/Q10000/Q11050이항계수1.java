package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11050이항계수1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(input.nextToken());
        int K = Integer.parseInt(input.nextToken());


        int answer=cal(N)/(cal(K)*cal(N-K));
        System.out.println(answer);
    }

    public static int cal(int n) {
        int total=1;

        for(int i=1;i<=n;i++) {

            total*=i;
        }
        return total;
    }
}
