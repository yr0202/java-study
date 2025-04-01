package ch13.innerclass;

class OutClass {
	private static int sNum = 20;
	private int num = 10;
	private InClass inClass;
	;

	public OutClass() {
		inClass = new InClass();
	}

	public void usingClass() {
		inClass.inTest();
	}

	class InClass {
		static int sInNum = 200;
		int inNum = 100;

		static void sTest() {
			System.out.println("인스턴스 내부 클래스의 정적 메서드 호출");
		}

		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수");
			// System.out.println("OutClass SInNum = " + SInNum + "(인스턴스 내부 클래스의 정적 변수");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		System.out.println("인스턴스 내부 클래스 정적 변수 직접 호출 OutClass.InClass.sInNum = " + OutClass.InClass.sInNum);
		OutClass.InClass.sTest();
	}
}
