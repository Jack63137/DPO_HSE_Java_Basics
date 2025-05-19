package HSE_Java_Basic.VKR;
import java.util.Scanner;

import HSE_Java_Basic.VKR.CaesarCipher;

public class Main {
    public static void main(String[] args){
        cipherChoice();
    }
    private static void cipherChoice(){
        Scanner scanner = new Scanner(System.in);
        boolean isRigth = false;
        int n;
        do{
            System.out.println("Выберите шифр:");
            System.out.println("1. Шифр Цезяра | 2. Шифр Винжера");
            n = scanner.nextInt();
            if (n ==1){
                System.out.println("Переход к шифру Цезаря");
                typeOfCipther(n);
                break;
            }
            else if(n==2){
                System.out.println("Переход к шифру Винжера");
                typeOfCipther(n);
                break;
            } else{
                System.out.println("ошибка ввода, повторите...");
            }
                
        }
        while(!isRigth);
    }

    private static void typeOfCipther(int type){
        Scanner scanner = new Scanner(System.in);
        boolean isRigth = false;
        int n;
        do{
            System.out.println("Выберите тип:");
            System.out.println("1. Зашифровать | 2. Расшифровать");
            n = scanner.nextInt();
            if (n ==1){
                System.out.println("Переход к зашифрованию");
                switch (type) {
                    case 1: //Цезарь зашифровать
                        caesarCipher_input(true);
                        break;
                    case 2:// Винжер расшифровать
                        vingerCipher_input(true);
                        break;
                    default:
                        break;
                }
                break;
            }
            else if(n==2){
                System.out.println("Переход разшифрованию");
                switch (type) {
                    case 1: //Цезарь зашифровать
                        caesarCipher_input(false);
                        break;
                    case 2:// Винжер расшифровать
                        vingerCipher_input(false);
                        break;
                    default:
                        break;
                }
                break;
            } else{
                System.out.println("ошибка ввода, повторите...");
            }
                
        }
        while(!isRigth);
    }
    private static void caesarCipher_input(boolean encr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст"); String text = scanner.nextLine();
        System.out.println("Введите ключ"); int key = scanner.nextInt();
        CaesarCipher caesarCipher = new CaesarCipher(true);
        String encripted_text;
        if (encr) {
            encripted_text= caesarCipher.encrypt(text,key);
        } else{
            encripted_text= caesarCipher.decrypt(text,key);
        }
        System.out.println("Обработанный текст: " + encripted_text);
        main(null);
    }
    private static void vingerCipher_input(boolean encr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст"); String text = scanner.nextLine();
        System.out.println("Введите ключ"); String key = scanner.nextLine();
        VingerCipher vingerCipher = new VingerCipher();
        String encripted_text;
        if (encr) {
            encripted_text= vingerCipher.encrypt(text,key);
        } else{
            encripted_text= vingerCipher.decrypt(text,key);
        }
        System.out.println("Обработанный текст: " + encripted_text);
        main(null);

    }
}
