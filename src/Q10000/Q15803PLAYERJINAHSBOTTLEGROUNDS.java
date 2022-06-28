package Q10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15803PLAYERJINAHSBOTTLEGROUNDS {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        double x1 = Integer.parseInt(input.nextToken());
        double y1= Integer.parseInt(input.nextToken());

        input = new StringTokenizer(br.readLine());
        double x2 = Integer.parseInt(input.nextToken());
        double y2= Integer.parseInt(input.nextToken());


        input = new StringTokenizer(br.readLine());
        double x3 = Integer.parseInt(input.nextToken());
        double y3= Integer.parseInt(input.nextToken());

        if(x1==x2 || x2==x3 || x3==x1) {
            if(x1==x2 && x2==x3)
                System.out.println("WHERE IS MY CHICKEN?");
            else
                System.out.println("WINNER WINNER CHICKEN DINNER!");
        }

        else if(y1==y2 || y2==y3 || y3==y1) {
            if(y1==y2 && y2==y3)
                System.out.println("WHERE IS MY CHICKEN?");
            else
                System.out.println("WINNER WINNER CHICKEN DINNER!");
        }

        else {
            if((y2-y1)/(x2-x1)==(y3-y1)/(x3-x1))
                System.out.println("WHERE IS MY CHICKEN?");
            else
                System.out.println("WINNER WINNER CHICKEN DINNER!");
        }
    }
}
