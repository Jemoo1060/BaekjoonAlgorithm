package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1269대칭차집합 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> hsA = new HashSet<>();
        Set<Integer> hsB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < A; i++) {
            hsA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < B; i++) {
            hsB.add(Integer.parseInt(st.nextToken()));
        }

        int result = 0;
        for(int num : hsA) {
            if(!hsB.contains(num)) {
                result++;
            }
        }
        for(int num : hsB) {
            if(!hsA.contains(num)) {
                result++;
            }
        }
        System.out.println(result);



    }
}
