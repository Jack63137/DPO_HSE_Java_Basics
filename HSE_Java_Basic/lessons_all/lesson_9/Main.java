package HSE_Java_Basic.lessons_all.lesson_9;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){



    }
    public static void integerToRoman(int n){
        Map<Integer, String> d = new LinkedHashMap<>();
        d.put(1000, "M"); d.put(900, "CM");
        d.put(500, "D"); d.put(400, "CD");
        d.put(100, "C"); d.put(90, "XC");
        d.put(50, "L"); d.put(40, "XL");
        d.put(10, "X"); d.put(9, "IX");
        d.put(5, "V"); d.put(4, "IV");
        d.put(1, "I");

        StringBuilder s = new StringBuilder();
        for (Integer i : d.keySet()){
            while(n>=1){
                s.append(d.get(i));
            }
        }

    }
}