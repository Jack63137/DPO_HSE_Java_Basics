package HSE_Java_Basic.VKR;
import java.util.Scanner;

import HSE_Java_Basic.VKR.CaesarCipher;

public class Main {
    public static void main(String[] args){

        Scanner s_str = new Scanner(System.in); Scanner s_str2 = new Scanner(System.in);
        System.out.print("Введите текст: "); String text = s_str.nextLine();
        System.out.print("Введите ключ: "); String key = s_str2.nextLine();
        VingerCipher vingerCipher = new VingerCipher();
        String en_str = vingerCipher.encrypt(text, key);
        String de_str = vingerCipher.decrypt(en_str, key);
        System.out.println(en_str);
        System.out.println(de_str);
        // System.out.print("Введите текст: "); String text = s_str.nextLine();
        // System.out.print("Введите ключ: "); int key = s_int.nextInt();

        // CaesarCipher caesarCipher = new CaesarCipher(false);
        // String encripted_text = caesarCipher.encrypt(text,3);
        // System.out.println("Расшифрованный текст: " + encripted_text);
        // String descripted_text = caesarCipher.decrypt(encripted_text);
        // System.out.println("Расшифрованный текст: " + descripted_text);
    }
}
