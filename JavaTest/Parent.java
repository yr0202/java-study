import org.w3c.dom.ls.LSOutput;

public class Parent {
	int a = 1;
}

class Child extends Parent {
}

class Test{
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a);
	}
}