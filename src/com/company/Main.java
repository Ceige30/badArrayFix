package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grades type -1 to end the process and see your average");
        int userinput = 0;
        int [] saved;
        while(userinput != -1) {
            userinput = sc.nextInt();
            int[] grade = {userinput};
            saved = grade, userinput;
        }

        int average = saved/grade.length;
        System.out.println("Your average is");
        System.out.println(average);
    }
}
