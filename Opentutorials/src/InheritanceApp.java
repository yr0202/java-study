class Cal{
    int v1, v2;
    Cal(int v1, int v2){ // 생성자
        System.out.println("Cal init!!");
        this.v1 = v1; this.v2 = v2;
    }
        public int sum(){return this.v1+v2;}
}
class Cal3 extends Cal{
    Cal3(int v1, int v2) {//부모에 생성자가 있다면 자식도 무조건 부모 생성자를 따라야한다
        super(v1, v2);
        System.out.println("Cal3 init!!");
    }
    public int minus(){return this.v1-v2;}
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal(2,1);
        Cal3 c3 = new Cal3(2,1);
        System.out.println(c3.sum());
        System.out.println(c3.minus());
    }
}

































//class Cal{
//    public int sum(int v1, int v2){
//        return v1+v2;
//    }
//    //Overloading
//    public int sum(int v1, int v2, int v3){
//        return this.sum(v1,v2)+v3;
//        //this는 자기자신
//    }
//}
//class Cal3 extends Cal{
//    public int minus(int v1, int v2){
//        return v1-v2;
//    }
//    //부모가 갖고 있는 기능을 재정의 했다, 덮어쓰기 했다
//    // Overriding
//    public int sum(int v1, int v2){
//        System.out.println("Cal3");
//        return super.sum(v1,v2);
//        // super는 부모 가리킴
//    }
//}
//
//public class InheritanceApp {
//    public static void main(String[] args) {
//        Cal c = new Cal();
//        System.out.println(c.sum(2,1));
//
//        Cal3 c3 = new Cal3();
//        System.out.println(c3.sum(2,1));
//        System.out.println(c3.minus(2,1));
//        System.out.println(c3.sum(2,1));
//    }
//}
