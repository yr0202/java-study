package ch13.lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";

		// 클래스로 구현
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);

		// 람다식으로 구현
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);

		// 익명 객체로 구현
		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			}
		};
		concat3.makeString(s1, s2);
	}
}
