package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        seconds = Math.max(0, seconds); // this method takes 2 parameters and returns the max value between them
        // and as I write, if number is negative method returns 0

        int hour = seconds/3600;
        hour = hour%24;

        int remainder = seconds%3600;
        int minute = remainder/60;
        int second = remainder%60;

        System.out.printf("%02d:%02d:%02d", hour, minute, second);


    }
}
