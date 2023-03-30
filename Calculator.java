import java.util.concurrent.Callable;

public class Calculator {


    public int suma(int n, int x) {
        return n + x;
    }

    public int umnogenie(int n, int x) {
        return n * x;
    }

    public int restar(int n, int x) {
        return n - x;
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
