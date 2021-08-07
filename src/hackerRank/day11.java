package hackerRank;
import java.util.*;

public class day11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[6][6];
        for(int i=0; i<6; i++)
            for(int j=0; j<6; j++)
                a[i][j] = sc.nextInt();
        int max = -63;
        for(int i=0; i<6; i++)
            for(int j=0; j<6; j++){
                if(j+2<6 && i+2<6){
                    int sum = a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                    if(sum>max)
                        max = sum;
                }
            }
        System.out.println(max);
    }
}
