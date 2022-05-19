import java.io.*;

 public class Q2869달팽이는올라가고싶다 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();

        String[] b = a.split(" ");

        int A = Integer.parseInt(b[0]);
        int B = Integer.parseInt(b[1]);
        int V = Integer.parseInt(b[2]);


        int count = (V - B) / (A - B);
        if((V - B) % (A - B) != 0){
            count++;
        }


        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
