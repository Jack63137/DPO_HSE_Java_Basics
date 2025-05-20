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
            System.out.println("\nВыберите шифр:");
            System.out.println("1. Шифр Цезяра");
            System.out.println("2. Шифр Винжера");
            System.out.println("3. Шифр Атбаш");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println("\nПереход к шифру Цезаря");
                    typeOfCipther(n);
                    break;
                case 2:
                    System.out.println("\nПереход к шифру Винжера");
                    typeOfCipther(n);
                    break;
                case 3:
                    System.out.println("\nПереход к шифру Атбаш");
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("\nВведите текст: ");
                    String text = scanner2.nextLine();
                    System.out.println(AtbashCipher.encrypt(text));
                    break;
            
                default:
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
            System.out.println("\nВыберите тип:");
            System.out.println("1. Зашифровать");
            System.out.println("2. Расшифровать");
            n = scanner.nextInt();
            if (n ==1){
                System.out.println("\nПереход к зашифрованию");
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
                System.out.println("\nПереход разшифрованию");
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
                System.out.println("\nошибка ввода, повторите...");
            }
                
        }
        while(!isRigth);
    }
    private static void caesarCipher_input(boolean encr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст"); String text = scanner.nextLine();
        System.out.println("Введите ключ (Число)"); int key = scanner.nextInt();
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
        System.out.println("Введите ключ (Слово)"); String key = scanner.nextLine();
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
