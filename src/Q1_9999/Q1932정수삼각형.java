package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932정수삼각형 {

    static int[][] check;
    static int[][] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        check = new int[n][n];
        dp = new int[n][n];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++){
                check[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i = 0; i < n; i++) {
            dp[n - 1][i] = check[n - 1][i];
        }

        System.out.println(cal(0,0));
    }

    public static int cal(int m, int k){

        if(m == n-1 ){
            return dp[m][k];
        }

        if(dp[m][k] == 0){
            dp[m][k] = Math.max(cal(m+1,k), cal(m+1,k+1)) + check[m][k];
        }

        return dp[m][k];
    }
    
}
