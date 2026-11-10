package homeworks.brace_checker;

public class BraceCheckerTest {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("----------Test1----------");
        BraceChecker braceChecker = new BraceChecker();
        System.out.print(braceChecker.check("Hello from [Java]"));

        System.out.println();
        System.out.println("----------Test2----------");
        System.out.print(braceChecker.check("{Hello (Java)}"));

        System.out.println();
        System.out.println("----------Test3----------");
        System.out.print(braceChecker.check("{[()]}"));

        System.out.println();
        System.out.println("----------Test4----------");
        System.out.print(braceChecker.check("Hello Java"));

        System.out.println();
        System.out.println("----------Test5----------");
        System.out.print(braceChecker.check("Hello from [Java)"));

        System.out.println();
        System.out.println("----------Test6----------");
        System.out.print(braceChecker.check("{[(])}"));

        System.out.println();
        System.out.println("----------Test7----------");
        System.out.print(braceChecker.check("Hello from Java]"));

        System.out.println();
        System.out.println("----------Test8----------");
        System.out.print(braceChecker.check("{Hello Java"));

        System.out.println();
        System.out.println("----------Test9----------");
        System.out.print(braceChecker.check("((()))"));

        System.out.println();
        System.out.println("----------Test10----------");
        System.out.print(braceChecker.check("(()"));


    }
}
