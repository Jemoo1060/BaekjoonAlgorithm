package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1010다리놓기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        while(count-- > 0){
            StringTokenizer input = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(input.nextToken());
            int M = Integer.parseInt(input.nextToken());

            int[][] check = new int[N+1][M+1];

            for(int n=2;n<=N;n++)
                check[n][1]=0;

            for(int m=1;m<=M;m++)
                check[1][m]=m;


            for(int x=2;x<=N;x++) {
                for(int y=2;y<=M;y++) {
                    check[x][y]=check[x][y-1]+check[x-1][y-1];
                }
            }

            System.out.println(check[N][M]);
        }

    }
}
