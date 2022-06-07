package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9491파도반수열 {

    static Long[] dp = new  Long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;
        dp[4] = 2L;
        dp[5] = 2L;

        while (n-- > 0){
            int k = Integer.parseInt(br.readLine());

            System.out.println(dbcheck(k));
        }

    }

    public static  Long dbcheck(int k){

        if(dp[k] != null){
            return dp[k];
        }

        dp[k] = dbcheck(k-2) + dbcheck(k-3);

        return dp[k];
    }
}
