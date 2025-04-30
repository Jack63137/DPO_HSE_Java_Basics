package HSE_Java_Basic.lessons_all.lesson_3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        char suits[] = {'\u2660','\u2665','\u2663','\u2666'};
        String[] values = {"6","7","8","9","10","В","Д","К","Т"};
        String[]card = new String[suits.length*values.length];
        int count =0;
        for(int i =0;i<suits.length;i++){
            for(int j=0;j<values.length;j++){
                card[count++] = suits[i]+values[j];
            }
        }
        System.out.println(Arrays.toString(card));

        
        


    }
}
