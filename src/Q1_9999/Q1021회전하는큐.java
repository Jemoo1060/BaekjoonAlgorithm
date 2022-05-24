package Q1_9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1021회전하는큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> linkedList = new LinkedList<>();


        for(int i = 1; i <= N; i++) {
            linkedList.add(i);
        }


        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            while(linkedList.getFirst() != num) {
                if(linkedList.indexOf(num) <= (linkedList.size() / 2)) {
                    linkedList.addLast(linkedList.getFirst());
                    linkedList.removeFirst();
                }else {
                    linkedList.addFirst(linkedList.getLast());
                    linkedList.removeLast();
                }
                count++;
            }

            if(linkedList.getFirst() == num) {
                linkedList.removeFirst();
            }
        }
        System.out.println(count);
    }
}
