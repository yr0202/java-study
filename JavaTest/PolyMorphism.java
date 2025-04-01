public class PolyMorphism {
	public static void main(String[] args) {

		Phone phone = new Phone();
		Phone iphone = new iPhone();
		Phone androidPhone = new AndroidPhone();

		boolean isPhoen = phone instanceof Phone;
		System.out.println("isPhoen = " + isPhoen);

		boolean isiPhone = iphone instanceof iPhone;
		System.out.println("isiPhone = " + isiPhone);

		boolean isAndroidPhone = androidPhone instanceof AndroidPhone;
		System.out.println("isAndroidPhone = " + isAndroidPhone);

		boolean isTypeOfPhone1 = iphone instanceof Phone;
		System.out.println("isTypeOfPhone1 = " + isTypeOfPhone1);

		boolean isTypeOfPhone2 = androidPhone instanceof Phone;
		System.out.println("isTypeOfPhone2 = " + isTypeOfPhone2);
	}
}

class Phone {
}

class iPhone extends Phone {
}

class AndroidPhone extends Phone {
}
