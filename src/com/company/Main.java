package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    int i;
    for (i = 0; i < 5; i++){
        System.out.println("Enter a number:");
        numbers.add(input.nextInt());
    }
    int total = 1;
    for (i = 0; i < 5; i++){
        total = total * numbers.get(i);
    }
    System.out.println(total);
    total = 0;
    for (i = 0; i < 5; i++){
        total += numbers.get(i);
    }
    double avv = (double) total / 5;
    System.out.println(total);
    System.out.println(avv);
    }
}
