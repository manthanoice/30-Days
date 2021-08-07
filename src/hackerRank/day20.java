package hackerRank;

import java.util.*;

public class day20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfSwaps = 0;
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++)
            a[i] = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-1; j++){
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps==0)
                break;
        }
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps."+"\nFirst Element: "+a[0]+"\nLast Element: "+a[n-1]);
    }
}