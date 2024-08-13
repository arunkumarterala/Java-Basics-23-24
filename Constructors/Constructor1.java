package Constructors;

public class Constructor1 {
    String FN;
    String LN;
    String Section;
    String Subject;
    int mobile;

    public static void main(String[] args) {
        Constructor1 S1 = new Constructor1();
        S1.FN = "Arun";
        S1.LN = "Kumar";
        S1.Section = "Epsilon";
        S1.Subject = "Maths";
        S1.mobile = 645;
        System.out.println(S1.FN);
        System.out.println(S1.LN);
        System.out.println(S1.Section);
        System.out.println(S1.Subject);
        System.out.println(S1.mobile);
    }

}
