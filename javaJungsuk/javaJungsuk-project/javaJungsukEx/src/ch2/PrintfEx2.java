package ch2;

public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        char c = 'A';
        double d = 1.23456789;

        System.out.printf("c = %c, %d %n", c, (int)c); // 꼭 형변환을 해줘야함
        System.out.printf("d=%14.10f %n", d); // 전체 14자리 중 소수점 아래 10자리
        System.out.printf("d=%014.10f %n", d); // 전체 14자리 중 소수점 아래 10자리

        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
    }
}
