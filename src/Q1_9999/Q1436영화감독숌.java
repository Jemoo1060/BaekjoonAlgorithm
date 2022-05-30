package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436영화감독숌 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        int num = 666;

        while (count < N) {

            if (String.valueOf(num).contains("666")) {
                count++;
            }

            num += 1;

        }

        System.out.println(num - 1);
    }
}
