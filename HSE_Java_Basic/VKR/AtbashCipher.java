package HSE_Java_Basic.VKR;

import java.util.Scanner;

class AtbashCipher {
    private static final String RUSSIAN_UPPER = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String RUSSIAN_UPPER_rev = "ЯЮЭЬЫЪЩШЧЦХФУТСРПОНМЛКЙИХЖЁЕДГВБА";
    private static final String RUSSIAN_LOWER = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String RUSSIAN_LOWER_rev = "яюэьыйщшчцхфутсрпонмлкйихжёедгвба";

    public AtbashCipher() {
        // Empty constructor
    }
    
    public static String encrypt(String text) {
        return process(text);
    }

    public static String decrypt(String text) {
        return process(text); 
    }

    private static String process(String text) {
        StringBuilder result = new StringBuilder();
        
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    int index = RUSSIAN_UPPER.indexOf(c);
                    if (index != -1) {
                        result.append(RUSSIAN_UPPER_rev.charAt(index));
                    }else{
                    // For uppercase: 'Z' - (c - 'A') = 'Z' + 'A' - c = 155 - c
                    char encrypted = (char)('Z' + 'A' - c);
                    result.append(encrypted);}
                } else {
                    int index = RUSSIAN_LOWER.indexOf(c);
                    if (index != -1) {
                        result.append(RUSSIAN_LOWER_rev.charAt(index));
                    } else{
                    // For lowercase: 'z' - (c - 'a') = 'z' + 'a' - c = 219 - c
                    char encrypted = (char)('z' + 'a' - c);
                    result.append(encrypted);}
                }
            } else {
                // Non-alphabetic characters remain unchanged
                result.append(c);
            }
        }
        return result.toString();
    }
}