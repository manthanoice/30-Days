package hackerRank;

import java.io.*;
import java.util.*;

public class day14 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int maxSum = 0;
        for(int i=0; i<n; i++)
            maxSum = a[n-1]-a[0];
        System.out.println(maxSum);
    }
}