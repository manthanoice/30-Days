package hackerRank;
import java.util.*;

public class day25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int flag = 0;
            if(n==1||n==0)
                System.out.println("Not prime");
            else{
                for(int i=2; i<=Math.sqrt(n); i++){
                    if(n%i==0){
                        flag = 1;
                        break;
                    }
                }
                String s = (flag==0)?"Prime":"Not prime";
                System.out.println(s);
            }
        }
    }
}