package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12865평범한배낭 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());

        // 물품의 수
        int N = Integer.parseInt(input.nextToken());

        // 버틸 수 있는 무게
        int K = Integer.parseInt(input.nextToken());

        // 물품의 무게(0)와 가치(1)
        int[][] a = new int[N+1][2];

        // 행: 물품의 무게, 열: 1~k까지의 무게, 값: 물품의 가치 누적
        int[][] dp = new int[N+1][K+1];

        // 물품들의 무게와 가치 입력
        for(int i=1;i<N+1;i++) {
            StringTokenizer input2 = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(input2.nextToken());
            a[i][1] = Integer.parseInt(input2.nextToken());
        }

        // 0행, 0열은 공백 인덱스로 비워둔다.
        for(int i=1;i<N+1;i++) {
            for(int j=1;j<K+1;j++) {
                // 비교 무게 - 물품의 무게 >= 0 인 경우,
                if(j - a[i][0] >= 0) {
                    // 이전 dp에 저장된 누적 가치와 자신의 가치+남은 무게의 가치 중 큰 값을 취한다.
                    dp[i][j] = Math.max( dp[i-1][j], a[i][1]+dp[i-1][j-a[i][0]]);
                }else {
                    // 나머지는 이전 dp에 누적된 가치를 취한다.
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println(dp[N][K]);


    }
}
