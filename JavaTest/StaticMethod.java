class StaticMethod {
	int tmp = 5;
	static int cv = 5;

	static int add(int a, int b) {
		return a + b + cv;
	}

	int sub(int a, int b) {
		return a - b + tmp + cv;
	}
}

class StaticTest{
	public static void main(String[] args) {
		StaticMethod st = new StaticMethod();
		System.out.println(StaticMethod.add(1,2));
		System.out.println(st.tmp);
		System.out.println(st.sub(3,3));

	}
}