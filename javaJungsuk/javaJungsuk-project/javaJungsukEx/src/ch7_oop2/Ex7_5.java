package ch7_oop2;

public class Ex7_5 {
}

class DVD{
    boolean power;

    void power(){power = !power;}
    void play(){/*내용 생략*/}
    void stop(){}
}

class TvDVD extends Tv{
    DVD dvd = new DVD();

    void play(){
        dvd.play();
    }
    void stop(){
        dvd.stop();
    }
}