package ch7_oop2.polymorphism;

class Tv {
    boolean power;
    int channel;

    void power(){power =!power;}
    void channelUp(){ ++channel; }
    void channelDown(){ --channel; }
}


