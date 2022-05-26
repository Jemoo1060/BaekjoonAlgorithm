package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q11866요세푸스문제0 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(input.nextToken());
        int K = Integer.parseInt(input.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int cnt = 0;
        StringBuilder sb = new StringBuilder("<");
        while (!list.isEmpty()) {
            cnt++;
            if(cnt == K) {
                sb.append(list.poll());
                if(list.size() != 0){
                    sb.append(", ");
                }
                cnt = 0;
            }else {
                list.add(list.poll());
            }
        }
        sb.append(">");

        System.out.println(sb);
    }
}
