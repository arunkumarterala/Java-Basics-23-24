package ConditionalStatement;

public class NestedIf {

    public static void main(String[] args) {
        int number = 10;
        boolean isEven = (number % 2 == 0);

        if (number > 0) {
            if (isEven) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive but odd.");
            }
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
