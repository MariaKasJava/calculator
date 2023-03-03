import java.util.concurrent.Callable;

public class Calculator {


    public int suma(int n, int x) {
        int c = n + x;
        return c;
    }

    public int umnogenie(int n, int x) {
        int c = n * x;
        return c;
    }

    public int restar(int n, int x) {
        int c = n - x;
        return c;
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int c = n * factorial(n - 1);
        return c;
    }

}
