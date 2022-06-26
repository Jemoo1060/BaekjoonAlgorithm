package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1380귀걸이 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int check = 0;
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if ( N == 0) {
                return;
            }else {
                check++;
            }

            ArrayList<String> student = new ArrayList<>();

            for(int i = 0; i < N; i++) {
                student.add(br.readLine());
            }

            ArrayList<Integer> numList = new ArrayList<>();
            for(int i = 0; i < N*2-1; i++ ) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());

                if (numList.contains(num)) {
                    numList.remove((Integer)num);
                }else {
                    numList.add(num);
                }
            }

            int result = numList.get(0);
            System.out.println(check + " " + student.get(result-1));
        }

    }
}
