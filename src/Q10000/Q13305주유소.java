package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13305주유소 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] distance = new long[N-1];
        long[] price = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N -1; i++){
            distance[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            price[i] = Long.parseLong(st.nextToken());
        }

        long result = price[0] * distance[0];
        long min = price[0];

        for(int i = 1; i < price.length-1; i++){
            if(price[i] < min){
                result += price[i] * distance[i];
                min = price[i];
            }
            else {
                result += min * distance[i];
            }
        }

        System.out.println(result);
    }
}
