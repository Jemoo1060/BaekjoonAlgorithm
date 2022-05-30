package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399ATM {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer input = new StringTokenizer(br.readLine());

        int result = 0;

        int[] list = new int[N];

        for(int i = 0; i < N; i++){
            list[i] =  Integer.parseInt(input.nextToken());
        }

        Arrays.sort(list);

        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++){
                result += list[j];
            }
        }

        System.out.println(result);
    }
}
