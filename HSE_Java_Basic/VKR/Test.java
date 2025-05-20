package HSE_Java_Basic.VKR;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        char encrypted = (char)('Z' + 'A' - c);
        System.out.println(encrypted);

    }
    
}
