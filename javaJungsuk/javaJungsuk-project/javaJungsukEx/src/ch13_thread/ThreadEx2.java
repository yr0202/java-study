package ch13_thread;

/**
 * 고의로 예외를 발생하여 호출스택 쌓이는 순서 확인
 */
public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 t = new ThreadEx2_1();
        t.start();
    }
}

class ThreadEx2_1 extends Thread {
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

/** 예외
 * java.lang.Exception
 * 	at ch13_thread.ThreadEx2_1.throwException(ThreadEx2.java:17)
 * 	at ch13_thread.ThreadEx2_1.run(ThreadEx2.java:12)
 *
 * 	첫번째 메서드가 run()임을 확인하자. main()스레드는 이미 종료됨
 */