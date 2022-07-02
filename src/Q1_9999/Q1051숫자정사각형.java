package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1051숫자정사각형 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        int list[][]= new int[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                list[i][j] = temp.charAt(j)-'0';
            }
        }

        int result = 1;

        int size = Integer.min(N, M);

        for (int k = 2; k <= size; k++) {
            for (int i = 0; i < N-k+1; i++) {
                for (int j = 0; j < M-k+1; j++) {
                    if( list[i][j] == list[i+k-1][j] && list[i][j] == list[i][j+k-1] && list[i][j] == list[i+k-1][j+k-1] ) {
                        if(result < k) {
                            result = k;
                        }
                    }
                }
            }
        }
        System.out.println(result*result);
    }

}
