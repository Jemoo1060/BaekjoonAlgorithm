package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11051이항계수2 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] temp = new int[1001][1001];

        for(int i = 0; i <= a; i++){

            for(int j = 0; j <= i; j++){

                if (j==0 || i==j)
                    temp[i][j] = 1;
                else
                    temp[i][j] = (temp[i-1][j-1] + temp[i-1][j])%10007;
            }

        }

        System.out.print(temp[a][b]);




    }
}
