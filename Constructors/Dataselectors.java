package Constructors;

public class Dataselectors {

    int v1, v2, v3;
    char v4, v5, v6;
    String v7, v8, v9;

    // Constructors
    Dataselectors(int a, int b, int c) {
        v1 = a;
        v2 = b;
        v3 = c;
    }

    Dataselectors(char d, char e, char f) {
        v4 = d;
        v5 = e;
        v6 = f;
    }

    Dataselectors(String g, String h, String i) {
        v7 = g;
        v8 = h;
        v9 = i;
    }

    // Methods to print sum
    void printSum(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    void printSum(char a, char b, char c) {
        System.out.println("Sum of three chars: " + (a + b + c)); // char sum will print ASCII values
    }

    void printSum(String a, String b, String c) {
        System.out.println("Concatenated sum of three strings: " + (a + b + c));
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects and printing sums
        Dataselectors obj1 = new Dataselectors(1, 2, 3);
        obj1.printSum(1, 2, 3);

        Dataselectors obj2 = new Dataselectors('x', 'y', 'z');
        obj2.printSum('x', 'y', 'z');

        Dataselectors obj3 = new Dataselectors("Arun ", "Kumar ", "Terala");
        obj3.printSum("Arun ", "Kumar ", "Terala");
    }
}
