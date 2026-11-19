package Week01;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if(num1 + num2 + num3 == 180){
            System.out.println("Triangle can be formed");
        }else{
            System.out.println("Triangle cannot be formed");
        }
    }
}
