package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1676팩토리얼0의개수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 1; i <= n; i++) {
            int tmp = i;

            while (tmp % 5 == 0) {
                tmp /= 5;
                count++;
            }
        }

        System.out.println(count);

    }
    
}
