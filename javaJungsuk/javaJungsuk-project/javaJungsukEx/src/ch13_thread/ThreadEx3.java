package ch13_thread;

public class ThreadEx3 {
    public static void main(String[] args) {
        ThreadEx3_1 t = new ThreadEx3_1();
        t.run();
    }
}

class ThreadEx3_1 extends Thread {
    public void run() {
        throwException();
    }

    public void throwException() {
        try{
            throw new Exception();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

/**
 * java.lang.Exception
 * 	at ch13_thread.ThreadEx3_1.throwException(ThreadEx3.java:17)
 * 	at ch13_thread.ThreadEx3_1.run(ThreadEx3.java:12)
 * 	at ch13_thread.ThreadEx3.main(ThreadEx3.java:6)
 */