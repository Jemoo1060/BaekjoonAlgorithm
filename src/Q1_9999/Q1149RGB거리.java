package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149RGB거리 {

    static int[][] check;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        check = new  int[n][3];
        dp = new  int[n][3];


        for (int i =0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            check[i][0] = Integer.parseInt(st.nextToken());
            check[i][1] = Integer.parseInt(st.nextToken());
            check[i][2] = Integer.parseInt(st.nextToken());
        }

        dp[0][0] = check[0][0];
        dp[0][1] = check[0][1];
        dp[0][2] = check[0][2];


        System.out.println(Math.min(cal(n- 1, 0), Math.min(cal(n - 1, 1), cal(n - 1, 2))));

    }

    public static int cal(int n, int k){

        if(dp[n][k] != 0 ){
            return dp[n][k];
        }

        if(k== 0) {
            dp[n][0] = Math.min(cal(n - 1, 1), cal(n - 1, 2)) + check[n][0];
        }
        else if(k == 1) {
            dp[n][1] = Math.min(cal(n - 1, 0), cal(n - 1, 2)) + check[n][1];
        }
        else {
            dp[n][2] = Math.min(cal(n - 1, 0), cal(n - 1, 1)) + check[n][2];
        }

        return dp[n][k];
    }
}
