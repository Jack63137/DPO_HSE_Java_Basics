package HSE_Java_Basic.lessons_all.lesson_8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        // Test the integerToRoman method with some examples
        System.out.println("3 -> " + integerToRoman(3));     // III
        System.out.println("4 -> " + integerToRoman(4));     // IV
        System.out.println("9 -> " + integerToRoman(9));     // IX
        System.out.println("58 -> " + integerToRoman(58));   // LVIII
        System.out.println("1994 -> " + integerToRoman(1994)); // MCMXCIV
        
        // Test the romanToInteger method
        System.out.println("III -> " + romanToInteger("III"));       // 3
        System.out.println("IV -> " + romanToInteger("IV"));         // 4
        System.out.println("IX -> " + romanToInteger("IX"));         // 9
        System.out.println("LVIII -> " + romanToInteger("LVIII"));   // 58
        System.out.println("MCMXCIV -> " + romanToInteger("MCMXCIV")); // 1994
    }
    
    public static String integerToRoman(int n){
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
            while(n >= i){
                s.append(d.get(i));
                n -= i;
            }
        }
        
        return s.toString();
    }
    
    public static int romanToInteger(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        // Iterate from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));
            
            // If current value is greater than or equal to previous value, add it
            // Otherwise subtract it (for cases like IV, IX, etc.)
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }
            
            prevValue = currentValue;
        }
        
        return result;
    }
    static boolean isValidRoman(String s){
        if (s==null) return 
            false;
        else 
            return s.matches("\\b(?:M{0,3})(?:C[MD]|D|C{0,3})(?:X[CL]|L|X{0,3})(I[XV|V|I{0,3}])");


    }
}