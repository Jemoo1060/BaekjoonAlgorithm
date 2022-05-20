import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10250ACM호텔 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++){
            String input = br.readLine();

            String[] split = input.split(" ");

            int H = Integer.parseInt(split[0]);
            int A = Integer.parseInt(split[2]);


            int b = A/H + 1;
            int c = A%H;

            if( c == 0){
                c = H;
                b = A/H;
            }

            System.out.println(c*100 + b);
        }


    }
}
