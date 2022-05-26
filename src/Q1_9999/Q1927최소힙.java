package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Q1927최소힙 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> list = new PriorityQueue<>();

        while(T-- > 0){
            int a = Integer.parseInt(br.readLine());
            if(a == 0){
                if(!list.isEmpty()){
                    sb.append(list.poll()).append("\n");
                    continue;
                } else {
                    sb.append("0\n");
                    continue;
                }
            }
            list.add(a);
        }
        System.out.println(sb);
    }
}
