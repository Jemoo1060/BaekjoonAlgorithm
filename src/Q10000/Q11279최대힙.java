package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q11279최대힙 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());

        while(T-- > 0){
            int a = Integer.parseInt(br.readLine());
            if(a == 0){
                if(list.isEmpty()){
                    sb.append("0\n");
                    continue;
                } else {
                    sb.append(list.poll() + "\n");
                }
            }
            list.add(a);
        }
        System.out.println(sb);
    }
}
