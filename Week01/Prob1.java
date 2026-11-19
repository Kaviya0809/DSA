package Week01;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String name = in.next();
        char a = in.next().charAt(0);
        System.out.println(num);
        System.out.println(name);
        System.out.println(a);
        in.close();
    }
}
