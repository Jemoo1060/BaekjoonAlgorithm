import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q18258큐2 {

    public static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());



        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push":
                    int x =  Integer.parseInt(st.nextToken());
                    list.add(x);
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "front":
                    sb.append(front()).append('\n');
                    break;

                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);


    }

    public static int pop() {
        if (list.isEmpty()) {
            return -1;
        } else {
            int tmp = list.getFirst();
            list.removeFirst();
            return tmp;
        }
    }

    public static int size() {
        return list.size();
    }

    public static int empty() {
        if (list.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if(size() == 0) {
            return -1;
        }
        else {
            return list.getFirst();
        }
    }

    public static int back() {
        if(size() == 0) {
            return -1;
        }
        else {
            return list.getLast();
        }
    }

}
