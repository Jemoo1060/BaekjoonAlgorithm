package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2609최대공약수와최소공배수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int A= Integer.parseInt(input.nextToken());
        int B= Integer.parseInt(input.nextToken());

        int a = A;
        int b = B;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        sb.append(a + "\n").append(A*B/a);
        System.out.println(sb);

    }
}
