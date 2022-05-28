package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1934최소공배수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0){

            StringTokenizer input = new StringTokenizer(br.readLine());
            int A= Integer.parseInt(input.nextToken());
            int B= Integer.parseInt(input.nextToken());

            int a = A;
            int b = B;

            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }

            sb.append(A*B/a).append("\n");
        }



        System.out.println(sb);





    }
}
