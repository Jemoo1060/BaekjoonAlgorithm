package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2798블랙잭 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(input.nextToken());
        int M = Integer.parseInt(input.nextToken());

        input = new StringTokenizer(br.readLine());

        int result = Integer.MIN_VALUE;

        int[] list = new int[N];

        for(int i = 0; i < N; i++){
            list[i] =  Integer.parseInt(input.nextToken());
        }

        for(int i = 0; i < N; i++){

            for(int j = i+1; j < N; j++){

                for(int k = j+1; k < N; k++){
                    int sum = list[i] + list[j] + list[k] ;
                    if(sum <= M){
                        result = Math.max(result,sum);
                    }

                }
            }
        }
        System.out.println(result);

    }
    
}
