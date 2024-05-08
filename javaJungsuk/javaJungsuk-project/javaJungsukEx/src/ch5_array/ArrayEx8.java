package ch5_array;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 로또 번호 생성
        int[] ball =  new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
        }

        for (int j = 0; j < 6; j++) {
            int n = (int)(Math.random()*45);
            int tmp = ball[j];
            ball[j] = ball[n];
            ball[n] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d\n", i, ball[i]);
        }

    }
}
