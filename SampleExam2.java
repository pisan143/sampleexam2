public class SampleExam2 {

    public static void rightTriangle(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        rightTriangle(n - 1);
    }

    public static void rightTriangle2(int n) {
        if (n == 0) {
            return;
        }
        rightTriangle2(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void rightTriangle3(int n, int base) {
        if (n == 0) {
            return;
        }
        int spaces = base - n;
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        rightTriangle3(n - 1, base);
    }

    public static void rightTriangle4(int n, int base) {
        if (n == 0) {
            return;
        }
        rightTriangle4(n - 1, base);
        int spaces = base - n;
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // double factorial, multiplying only the odd numbers
    // 9!! = 1 × 3 × 5 × 7 × 9 = 945
    public static int doubleFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * doubleFactorial(n - 2);
    }

    // https://practiceit.cs.washington.edu/problem/view/2517?categoryid=335
    public static void parenthesize(String s, int n) {
        if (n == 0) {
            System.out.print(s);
            return;
        }
        System.out.print("(");
        parenthesize(s, n - 1);
        System.out.print(")");
    }

    // https://practiceit.cs.washington.edu/problem/view/806?categoryid=335
    public static void writeSequence(int n) {
        if (n < 1) {
            return;
        }
        if (n == 1) {
            System.out.print("1 ");
            return;
        }
        System.out.print((n + 1) / 2);
        System.out.print(" ");
        writeSequence(n - 2);
        System.out.print((n + 1) / 2);
        System.out.print(" ");
    }

    // https://practiceit.cs.washington.edu/problem/view/cs2/sections/section12/mystery

    public static void main(String[] args) {
        IntNode n1 = new IntNode(1);
        IntNode n2 = new IntNode(2, n1);
        IntNode n3 = new IntNode(3, n2);
        IntNode n4 = new IntNode(4, n3);
        System.out.println(n1);
        System.out.println(n2);
    }

}
