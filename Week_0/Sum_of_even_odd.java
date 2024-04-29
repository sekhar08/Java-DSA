package Java_DSA.Week_0;

import java.util.Scanner;

public class Sum_of_even_odd {
    public static void main(String[] args) {
        // Write your code here
        int oddSum=0;
        int evenSum=0;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while(n > 0){
            int value = n % 10;
            if(value % 2 == 0){
                evenSum += value;
            }else{
                oddSum+= value;
            }
            n = n / 10;
        }
        System.out.print(evenSum + " ");
        System.out.print(oddSum);
    }
}
