package ch7_oop2;

class Point2{
    int x;
    int y;
    String getLocation(){
        return "x:"+x+", y:"+y;
    }
}

class Point3D extends Point2{
    int z;
    String getLocation(){
        return "x:"+x+", y:"+y+", z:"+z;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Point3D p = new Point3D();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p.getLocation());
    }
}
