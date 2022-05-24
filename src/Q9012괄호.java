import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9012괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        while(T-- > 0){
            String input = br.readLine();
            while(input.contains("()")){
                input = input.replace("()", "");
            }

            if(input.equals("")){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }

        }


    }
}
