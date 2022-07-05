package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10816숫자카드2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> hm = new HashMap<>();
        StringTokenizer input = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int temp = Integer.parseInt(input.nextToken());

            if(hm.get(temp) == null){
                hm.put(temp,1);
            } else {
                hm.put(temp, hm.get(temp) + 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        input = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            int temp = Integer.parseInt(input.nextToken());

            if(hm.get(temp) == null){
                sb.append(0).append(" ");
            }
            else {
                sb.append(hm.get(temp)).append(" ");
            }
        }

        System.out.println(sb);

    }
}
