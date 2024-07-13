package ExecutorService.Challenge3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Testing {

    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                FactorialCalculator task = new FactorialCalculator(i);
                list.add(service.submit(task));
            }

            for (Future<Integer> future : list) {
                System.out.printf("\n Result is %d", future.get());
            }

            service.shutdown();

            if (!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("Enough Now\n");
                service.shutdownNow();
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
