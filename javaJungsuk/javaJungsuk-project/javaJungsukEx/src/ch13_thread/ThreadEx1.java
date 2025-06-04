package ch13_thread;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();
        t1.setName("t1"); // 스레드 이름 변경

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);
        // Thread t3 = new Thread(new ThreadEx1_2()); // 위에 두줄을 한줄로
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(this.getName());
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(Thread.currentThread().getName());
        }
    }
}