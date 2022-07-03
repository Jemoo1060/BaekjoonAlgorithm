package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1120문자열 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());

        String A = input.nextToken();
        String B = input.nextToken();

        int result = Integer.MAX_VALUE;
        int check;

        for(int i = 0; i <= B.length()- A.length(); i++) {
            check = 0;
            for(int j = 0; j < A.length(); j++) {
                if(A.charAt(j) != B.charAt(i+j)) {
                    check++;
                }
            }
            if(check < result)
                result = check;
        }

        System.out.println(result);

    }

}
