package hackerRank;

import java.util.*;

public class day19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0)
                sum+=i;
        }
        System.out.println("I implemented: AdvancedArithmetic"+"\n"+sum);
        // System.out.println(sum);
    }
}