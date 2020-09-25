package com.company;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        String age = scanner.nextLine();
        switch (age) {
            case "0" :
                System.out.println("You've born!");
                break;
            case "7" :
                System.out.println("You're schoolboy");
                break;
            case "18" :
                System.out.println("You're student");
                break;
            default:
                System.out.println("None");
        }
    }
}
