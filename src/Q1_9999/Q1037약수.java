package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1037약수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer input = new StringTokenizer(br.readLine());

        int max = 0;
        int min = 1000000;

        for(int i = 0; i < count; i++){
            int j = Integer.parseInt(input.nextToken());

            if(j > max) max = j;
            if(j < min) min = j;
        }

        System.out.println(max * min);
    }

}
