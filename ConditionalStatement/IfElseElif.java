package ConditionalStatement;

import java.util.Scanner;

public class IfElseElif {
    public static void main(String[] args) {
        int a;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the value of a");
            a = input.nextInt();
        }
        if (a > 70) {
            System.out.println("The value is greater than 'a' ");
        } else if (a > 60 && a < 100) {
            System.out.println("The value is between 60 and 100");
        } else if (a < 80 && a > 60) {
            System.out.println("The value is between 80 and 60");
        } else {
            System.out.println("The value is above infinity");
        }
    }
}
