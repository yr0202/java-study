package ch4;

// 이름 붙은 반복문

public class FlowEx33 {
    public static void main(String[] args) {
        Loop1 :
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
//                    break Loop1;
//                    break;
//                    continue;
                    continue Loop1;
                }
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
