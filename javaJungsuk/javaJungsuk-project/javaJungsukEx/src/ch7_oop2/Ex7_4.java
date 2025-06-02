package ch7_oop2;

class MyPoint{ // => class MyPoint extends Object
    int x;
    int y;
}

//class Circle extends MyPoint{
//    int r;
//}

class Circle{ // => class Circle extends Object
    MyPoint p = new MyPoint();
    int r;
}
public class Ex7_4 {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString()); // ch7_oop2.Circle@41629346 // 클래스명, 객체의 주소값
    }
}
