import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1011FlymetotheAlphaCentauri {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            String input = br.readLine();

            String[] split = input.split(" ");

            int X = Integer.parseInt(split[0]);
            int Y = Integer.parseInt(split[1]);

            int distance = Y - X;

            int max = (int)Math.sqrt(distance);

            if(max == Math.sqrt(distance)) {
                System.out.println(max * 2 - 1);
            }
            else if(distance <= max * max + max) {
                System.out.println(max * 2);
            }
            else {
                System.out.println(max * 2 + 1);
            }

        }
    }
}
