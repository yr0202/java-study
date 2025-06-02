package ch5_array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95,1,150};

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i]>max){
                max = score[i];
            }
            else if (score[i]<min){
                min = score[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
