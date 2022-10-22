package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978소수찾기 {

       public static void main(String[] args) throws IOException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < T; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp != 1 && isPrime(temp)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean isPrime(int n){
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
