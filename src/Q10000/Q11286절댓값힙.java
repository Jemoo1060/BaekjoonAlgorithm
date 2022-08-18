package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q11286절댓값힙 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(

                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if(Math.abs(o1) == Math.abs(o2)) {
                            return o1 - o2;
                        }
                        return Math.abs(o1) - Math.abs(o2);
                    }
                }
        );

        while(T-- > 0) {
            int check = Integer.parseInt(br.readLine());
            if( check == 0)
            {
                if(queue.isEmpty())
                {
                    sb.append("0").append("\n");
                }
                else
                {
                    sb.append(queue.poll()).append("\n");
                }
            }
            else
            {
                queue.add(check);
            }

        }


        System.out.println(sb);




    }
}
