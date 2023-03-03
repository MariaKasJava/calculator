import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Polzovatel {
    public Calculator calculator = new Calculator();
    public List<Integer> listCalculation = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public int n;
    public int c;
    public int  otvet ;
    public void print() {

        System.out.println("enter the 1 st number");
        n = scanner.nextInt();
        System.out.println("enter the 2 nd number");
        c = scanner.nextInt();
    }

    public void calculation() throws ExecutionException, InterruptedException {
        System.out.println("Choose an action");
        System.out.println("1 ---resta");
        System.out.println("2 ---suma");
        System.out.println("3 ---umnogenie");
        System.out.println("4 ---factorial");
        System.out.println("5 ----start");

        otvet = scanner.nextInt();



        if (otvet==1) {
            print();
            listCalculation.add(calculator.restar(n, c));

        }
        if (otvet==2) {
            print();
            listCalculation.add(calculator.suma(n, c));
        }
        if (otvet==3) {
            print();
            listCalculation.add(calculator.umnogenie(n, c));
        }
        if (otvet==4) {
            System.out.println("enter the 1 st number");
            int n = scanner.nextInt();
            listCalculation.add(calculator.factorial(n));

        }
        if (otvet==5) {
            Callable task = () -> listCalculation;
            FutureTask<Integer> futureTask = new FutureTask<>(task);
            new Thread(futureTask).start();

            System.out.println(futureTask.get());
            Thread.currentThread().interrupt();

        }
    }
}

