package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1049기타줄 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input.nextToken());
        int M = Integer.parseInt(input.nextToken());
        int min = Integer.MAX_VALUE;

        int[] set = new int[M];
        int[] unit = new int[M];

        for(int i = 0; i < M; i++){
            input = new StringTokenizer(br.readLine());
            set[i] = Integer.parseInt(input.nextToken());
            unit[i] = Integer.parseInt(input.nextToken());
        }

        Arrays.sort(set);
        Arrays.sort(unit);

        min = Math.min(Math.min(N*unit[0], (N/6+1)*set[0]), (N/6)*set[0] + (N%6)*unit[0]);

        System.out.println(min);



    }
}
