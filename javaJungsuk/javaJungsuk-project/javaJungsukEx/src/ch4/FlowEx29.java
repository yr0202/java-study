package ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        //System.out.println(90%10);
        for (int i = 1; i <= 100; i++) {
            System.out.printf("i=%d ", i);

            int tmp = i;

            do {
                // 일의 자리를 먼저 확인 후, 십의 자리를 일의 자리로 만들고 확인
                //System.out.print("실행 ");

                // tmp%10%3 => 일의자리가 3의 배수인지 확인
                // 단, 일의자리가 0이면 제외
                System.out.print(tmp+"%10 = "+ tmp%10);

                if (tmp%10%3 == 0 && tmp%10!=0)
                    System.out.print("짝");
            } while ((tmp/=10)!=0);

            System.out.println();
        }
    }
}

class InitTest{
    int x; //인스턴스 변수
    int y = x; //인스턴스 변수

    void methode1(){
        int i; // 지역변수
//        int j = i; //에러, 지역변수를 초기화하지 않고 사용
    }
}