package juint;

public class PerformanceTesting {

    public static void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);

    }
    public static void main(String[] args) throws InterruptedException {
        longRunningTask();
    }
}
