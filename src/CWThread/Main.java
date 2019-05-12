package CWThread;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            new Potok("Thread 1");
            new Potok( "Thread 2");
            new Potok("Thread 3");
            new Potok("Thread 4");
            new Potok("Thread 5");
            new Potok("Thread 6");
        }

    }
}

