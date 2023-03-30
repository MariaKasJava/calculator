import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Controler {
    public static void main(String[] args) throws ExecutionException, InterruptedException {//must run not in controller
        Polzovatel polzovatel = new Polzovatel();
        while (!Thread.interrupted()) {
            polzovatel.calculation();
        }

    }
}
