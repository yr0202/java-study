package ch7_oop2.polymorphism;

public class CarTest {
    public static void main(String[] args) {
        Car car = new FireEngine();
        FireEngine fe = new FireEngine();

        FireEngine fe2 = (FireEngine)car;
        Car car2 = (Car)fe2;
        fe2.drive();
    }
    /*
    FireEngine f = new FireEngine();
    // f로 다룰 수 있는 건 5가지
    Car c = (Car)f; // ok, 조상인 Car타입으로 형변환(생략가능)
    // c로 다룰 수 있는 건 4가지
    FireEngine f2 = (FireEngine)c; // ok, 자손인 FireEngine타입으로 형변환(생략불가)
    //Ambulance a = (Ambulance) f;// error. 상속관계가 아닌 클래스 간의 형변환 불가
    */

}
