package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q1002터렛 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder check = new StringBuilder();

        while (N-- > 0) {
            String input = br.readLine();

            String[] split = input.split(" ");

            int x1 = Integer.parseInt(split[0]);
            int y1 = Integer.parseInt(split[1]);
            int r1 = Integer.parseInt(split[2]);
            int x2 = Integer.parseInt(split[3]);
            int y2 = Integer.parseInt(split[4]);
            int r2 = Integer.parseInt(split[5]);

            int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if(x1 == x2 && y1 == y2 && r1 == r2) {
                check.append(-1);
            }
            else if(distance_pow > Math.pow(r1 + r2, 2)) {
                check.append(0);
            }
            else if(distance_pow < Math.pow(r2 - r1, 2)) {
                check.append(0);
            }
            else if(distance_pow == Math.pow(r2 - r1, 2)) {
                check.append(1);
            }
            else if(distance_pow == Math.pow(r1 + r2, 2)) {
                check.append(1);
            }
            else {
                check.append(2);
            }

            System.out.println(check);
            check.setLength(0);
        }


    }
}
