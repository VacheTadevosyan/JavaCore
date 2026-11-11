package homeworks.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("----------Test1----------");
        BraceChecker test1 = new BraceChecker("Hello from [Java]");
        test1.check();

        System.out.println();
        System.out.println("----------Test2----------");
        BraceChecker test2 = new BraceChecker("{Hello (Java)}");
        test2.check();

        System.out.println();
        System.out.println("----------Test3----------");
        BraceChecker test3 = new BraceChecker("{[()]}");
        test3.check();

        System.out.println();
        System.out.println("----------Test4----------");
        BraceChecker test4 = new BraceChecker("Hello Java");
        test4.check();

        System.out.println();
        System.out.println("----------Test5----------");
        BraceChecker test5 = new BraceChecker("Hello from [Java)");
        test5.check();

        System.out.println();
        System.out.println("----------Test6----------");
        BraceChecker test6 = new BraceChecker("{[(])}");
        test6.check();

        System.out.println();
        System.out.println("----------Test7----------");
        BraceChecker test7 = new BraceChecker("Hello from Java]");
        test7.check();

        System.out.println();
        System.out.println("----------Test8----------");
        BraceChecker test8 = new BraceChecker("{Hello Java");
        test8.check();

        System.out.println();
        System.out.println("----------Test9----------");
        BraceChecker test9 = new BraceChecker("((()))");
        test9.check();

        System.out.println();
        System.out.println("----------Test10----------");
        BraceChecker test10 = new BraceChecker("(()");
        test10.check();
    }
}
