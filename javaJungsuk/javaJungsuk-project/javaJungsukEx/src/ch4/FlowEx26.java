package ch4;

public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while((sum += ++i) <= 100){
            System.out.printf("i: %d, sum: %d\n", i, sum);
        }
    }
}
