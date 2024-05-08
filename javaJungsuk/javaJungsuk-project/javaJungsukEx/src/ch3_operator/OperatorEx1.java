package ch3_operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        int aa = 15;
        System.out.println(aa<<2);

        int i=-1;
        System.out.println(i = -i);

        int a = 1000_000;
        int b = 2_000_000;
        long c = (long)a*b;
        System.out.println("c = " + c);

        char c1='a';
        char c2 = (char)(c1+1);
        System.out.println("c2 = " + c2);
        char c3 = ++c1;
        System.out.println("c3 = " + c3);

        int i1 ='B'-'A';
        System.out.println("i1 = " +i1);

        int i2 = '2'-'0';
        System.out.println("i2 = " + i2);

    }
}
