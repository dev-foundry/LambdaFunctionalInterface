import java.util.Arrays;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {

        int x = 2;
        int y = 5;

        Sum sum = (a, b) -> a + b;

        System.out.println(sum.calculate(x, y));

        Factor factor = a -> a * a;

        System.out.println(factor.calculate(x));

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        integerList.forEach(element -> System.out.println(element));

        NothingSpecial nothingSpecial = TestApp::printMessage;

        nothingSpecial.nothing();

        integerList.forEach(System.out::println);

    }

    private static void printMessage() {
        System.out.println("Hello");
    }

}
