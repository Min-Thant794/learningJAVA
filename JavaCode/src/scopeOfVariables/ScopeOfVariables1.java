package scopeOfVariables;

public class ScopeOfVariables1 {
    static int x = 10; //Global variable
    static int y = 12; //Global variable

    public static void procX() {
        int x = 8;
        System.out.println("In ProcX");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void procY() {
        int y = 6;
        System.out.println("In ProcY");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        procX();
        procY();
        System.out.println("Main: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
