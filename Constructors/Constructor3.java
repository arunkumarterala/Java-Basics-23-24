package Constructors;

class Assignment {
    int x, y, z;
    float a, b, c;
    long d, e, f;
    double g, h, i;

    Assignment(int a) {
        x = a;
        System.out.println("The sum of a : " + a);
    }

    Assignment(int a, int b) {
        x = a;
        y = b;
        System.out.println("The sum of a and b : " + (a + b));
    }

    Assignment(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
        System.out.println("The sum of a,b and c : " + (a + b + c));
    }

    Assignment(float a) {
        a = a;
        System.out.println("The float of a : " + a);
    }

    Assignment(float a, float b) {
        a = a;
        b = b;
        System.out.println("The float of a and b : " + (a + b));
    }

    Assignment(float a, float b, float c) {
        a = a;
        b = b;
        c = c;
        System.out.println("The float of a,b and c : " + (a + b + c));
    }

    Assignment(long a) {
        d = a;
        System.out.println("The long of a : " + a);
    }

    Assignment(long a, long b) {
        d = a;
        e = b;
        System.out.println("The long of a and b : " + (a + b));
    }

    Assignment(long a, long b, long c) {
        d = a;
        e = b;
        f = c;
        System.out.println("The long of a,b and c : " + (a + b + c));
    }

    Assignment(double a) {
        g = a;
        System.out.println("The double of a : " + a);
    }

    Assignment(double a, double b) {
        g = a;
        h = b;
        System.out.println("The double of a and b : " + (a + b));
    }

    Assignment(double a, double b, double c) {
        g = a;
        h = b;
        i = c;
        System.out.println("The double of a,b and c : " + (a + b + c));
    }

    int add(int a) {
        return a;
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    float add(float a) {
        return a;
    }

    float add(float a, float b) {
        return a + b;
    }

    float add(float a, float b, float c) {
        return a + b + c;
    }

    long add(long a) {
        return a;
    }

    long add(long a, long b) {
        return a + b;
    }

    long add(long a, long b, long c) {
        return a + b + c;
    }

    double add(double a) {
        return a;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b;
    }

    public static void main(String[] args) {
        Assignment A1 = new Assignment(5);
        System.out.println(A1.add(5));
        Assignment A2 = new Assignment(5, 6);
        System.out.println(A2.add(5, 6));
        Assignment A3 = new Assignment(5, 6, 7);
        System.out.println(A3.add(5, 6, 7));
        Assignment A4 = new Assignment(10.5f);
        System.out.println(A4.add(10.5f));
        Assignment A5 = new Assignment(10.5f, 12.7f);
        System.out.println(A5.add(10.5f, 12.7f));
        Assignment A6 = new Assignment(10.5f, 12.7f, 13.3f);
        System.out.println(A6.add(10.5f, 12.7f, 13.3f));
        Assignment A7 = new Assignment(5999);
        System.out.println(A7.add(5999));
        Assignment A8 = new Assignment(5999, 6999);
        System.out.println(A8.add(5999, 6999));
        Assignment A9 = new Assignment(5999, 6999, 7999);
        System.out.println(A9.add(5999, 6999, 7999));
        Assignment A10 = new Assignment(900.300);
        System.out.println(A10.add(900.300));
        Assignment A11 = new Assignment(900.300, 800.400);
        System.out.println(A11.add(900.300, 800.400));
        Assignment A12 = new Assignment(900.300, 800.400, 700.200);
        System.out.println(A12.add(900.300, 800.400, 700.200));
    }
}