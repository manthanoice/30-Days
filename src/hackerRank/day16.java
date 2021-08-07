package hackerRank;

import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try{
            Integer n = Integer.parseInt(s);
            System.out.println(n);
        }
        catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
