package ch13;

class Outer { // 외부 클래스
	class Inner { // 내부 클래스
		static class SIn{} // 정적 내부 클래스
	}

	static class StaticInner{} // 정적 내부 클래스

	public void abc() {
		class Local {} // 지역 내부 클래스
	}
}
