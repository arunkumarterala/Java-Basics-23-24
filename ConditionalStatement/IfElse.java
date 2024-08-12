package ConditionalStatement;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = input.nextInt();
        if (a > 100) {
            System.out.println("The value is greater than 'A' 100");
            System.out.println("The value is greater than 200");
        } else {
            System.out.println("The value is lower than 100");
        }
    }
}
