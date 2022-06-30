package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1026보물 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] A = new int[T];
        int[] B = new int[T];

        StringTokenizer input = new StringTokenizer(br.readLine());

        for(int i = 0; i < T; i++){
            A[i] = Integer.parseInt(input.nextToken());
        }

        input = new StringTokenizer(br.readLine());
        for(int i = 0; i < T; i++){
            B[i] = Integer.parseInt(input.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i = 0; i < T; i++){
            sum += A[i] * B[T-1-i];
        }

        System.out.println(sum);

    }
}
