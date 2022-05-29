package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11047동전0 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(input.nextToken());
        int K = Integer.parseInt(input.nextToken());

        int[] list = new int[N];

        int count = 0;

        for(int i = 0; i < N; i++){
            list[i] = Integer.parseInt(br.readLine());
        }

        for(int i = N-1; i >= 0; i--){

            if(list[i] <= K){
                count += (K/list[i]);
                K = K % list[i];
            }
        }
        System.out.println(count);
    }
    
}
