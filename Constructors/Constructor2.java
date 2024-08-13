package Constructors;

public class Constructor2 {

    String FN;
    String LN;
    int Roll;
    char Name;

    void Display() {
        System.out.println(FN);
        System.out.println(LN);
        System.out.println(Roll);
        System.out.println(Name);
    }

    public static void main(String[] args) {
        Constructor2 D1 = new Constructor2();// here D1 is reference variable
        D1.FN = "Arun kumar";
        D1.LN = "Terala";
        D1.Roll = 645;
        D1.Name = 'A';
    }
}
