package ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) squre");
            System.out.println("(2) squre root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1<= menu && menu <= 3)){
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
                continue;
            }
            System.out.println("선택하신 메뉴는" + menu +"번입니다.");
        }
    }
}
