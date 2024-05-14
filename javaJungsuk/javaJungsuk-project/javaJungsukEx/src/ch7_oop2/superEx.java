package ch7_oop2;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

import java.util.*;

import java.util.*;
import java.text.*;

//import java.*;

import static java.lang.Integer.*;
import static java.lang.Math.random;
import static java.lang.System.out;
public class superEx {

}

class SuperPoint{
    int x, y;
    SuperPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class SuperPoint3D extends SuperPoint{
    int z;

    SuperPoint3D(int x, int y, int z) {
        super(x, y); // 조상클래스의 생성자 SuperPoint(int x, int y)를 호출
        this.z = z;
    }
}

final class FinalTest{ // 조상이 될 수 없는 클래스
    final int MAX_SIZE = 10; // 값을 변경할 수 없는 멤버변수(상수)

    final int getMasSize(){ // 오버라이딩 할 수 없는 메서드(변경불가)
        final int LV = MAX_SIZE; // 값을 변경할 수 없는 지역변수(상수)
        return MAX_SIZE;
    }
}

abstract class AbstractTest{ // 추상 클래스(추상 메서드를 포함한 클래스)
    abstract void move(); // 추상 메서드(구현부가 없는 메서드)
}
