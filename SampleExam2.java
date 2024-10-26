public class SampleExam2 {

    // Draws upside down right triangle, n = 5
    // *****
    // ****
    // ***
    // **
    // *
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

    // Draws right triangle, n = 5
    // *
    // **
    // ***
    // ****
    // *****
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

    // Draws upside down right triangle that is right justified
    // n = 5, base = 5
    // *****
    // .****
    // ..***
    // ...**
    // ....*
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

    // Draws right triangle that is right justified
    // n = 5, base = 5
    // ....*
    // ...**
    // ..***
    // .****
    // *****
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

    // Calculates factorial: n! = n * (n - 1)!
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
    // Adds parenthesis around the given string
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
    // Write the sequence given in the above URL
    // writeSequence(5) ==> 3 writeSequence(3) 3
    // writeSequence(3) ==> 2 writeSequence(1) 2
    public static void writeSequence(int n) {
        if (n < 1) {
            return;
        }
        if (n == 1) {
            System.out.print("1 ");
            return;
        }
        int num = (n + 1) / 2;
        System.out.print(num + " ");
        writeSequence(n - 2);
        System.out.print(num + " ");
    }

    // https://practiceit.cs.washington.edu/problem/view/cs2/sections/section12/mystery
    public static void mystery(int n) {
        System.out.print("+");
        if (n >= 10) {
            mystery(n / 10);
        }

        if (n % 2 == 0) {
            System.out.print("-");
        } else {
            System.out.print("*");
        }
    }

    public static void testInheritance() {
        A o1 = new B();
        A o2 = new C();
        System.out.println("Object B, cast to A, calling moo");
        o1.moo();
        System.out.println("Object C, cast to A, calling moo");
        o2.moo();
        System.out.println("Object B, cast to A, calling woof");
        System.out.println("  would give compile error");
        // o1.woof();
        System.out.println("Object C, cast to A, calling woof");
        o2.moo();
        // the following line would give compile error
        // cannot cast to a subclass
        // B o3 = new A();

    }

    // Testing functions. Comment them out as needed
    public static void main(String[] args) {
        rightTriangle(5);
        // rightTriangle2(5);
        // rightTriangle3(5, 5);
        // rightTriangle4(5, 5);
        // System.out.println("factorial(10) = " + factorial(10));
        // System.out.println("doubleFactorial(9) = " + doubleFactorial(9));
        // System.out.println("Hello with 3 parens = ");
        // parenthesize("Hello", 3);
        // writeSequence(5);
        // System.out.println("mystery 43269 prints:");
        // mystery(43269);
        // testInheritance();
        // IntNode.testLinkedListAll();
    }

}
