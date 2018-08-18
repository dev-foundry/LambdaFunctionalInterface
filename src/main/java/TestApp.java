public class TestApp {

    public static void main(String[] args) {

        int x = 2;
        int y = 5;

        Sum sum = (a, b) -> a + b;

        System.out.println(sum.calculate(x, y));

        Factor factor = a -> a * a;

        System.out.println(factor.calculate(x));

        NothingSpecial nothingSpecial = TestApp::printMessage;

        nothingSpecial.nothing();

    }

    private static void printMessage() {
        System.out.println("Hello");
    }

}
