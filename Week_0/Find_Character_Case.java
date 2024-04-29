package Java_DSA.Week_0;
//https://www.naukri.com/code360/problems/find-character-case_58513?leftPanelTabValue=PROBLEM

import java.util.Scanner;

public class Find_Character_Case {
    public static void main(String[] args) {
        // Write your code here
        Scanner in = new Scanner(System.in);
        char input = in.next().charAt(0);

        if(input >=65 && input <= 90){
            System.out.println(1);
        }
        else if(input >=97 && input <=122){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }

    }
}
