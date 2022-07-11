package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1358하키 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int R = H/2;

        int count = 0;

        while(P-- > 0){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x - X >= 0 && x - X <= W && y - Y >= 0 && y - Y <= H ){
                count++;
            }
            else if(Math.pow(Math.abs(x - X ),2) + Math.pow(Math.abs(y-Y-R),2) <= R*R) {
                count++;
            }
            else if(Math.pow(Math.abs(x - X - W),2) + Math.pow(Math.abs(y-Y-R),2) <= R*R) {
                count++;
            }
        }

        System.out.println(count);


    }
}
