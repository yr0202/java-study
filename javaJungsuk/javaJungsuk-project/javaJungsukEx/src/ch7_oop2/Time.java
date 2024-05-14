package ch7_oop2;

class Time {
    private int hour; // 0~23 사이의 값을 가져야함.
    private int minute; // 0~59 사이의 값을 가져야함.
    private int second; // 0~59 사이의 값을 가져야함.

    private boolean isNotValidHour(int hour){
        return hour<0 || hour >23;
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(isNotValidHour(hour)) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}


