package scopeOfVariables;

public class ScopeOfVariables2 {
    static int j = 8;

    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " ");
        }

        System.out.println("\n" + j);
    }
}
