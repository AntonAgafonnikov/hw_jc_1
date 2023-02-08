package java_core_1_2_worker;

public class Main {
    public static void main(String[] args) {
        //Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener error = System.out::println;

        //Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskDoneListener listener = x -> System.out.println(x);

        Worker worker = new Worker(listener, error);
        worker.start();
    }
}
