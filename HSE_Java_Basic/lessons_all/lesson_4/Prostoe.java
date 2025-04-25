package HSE_Java_Basic.lessons_all.lesson_4;

import java.util.Scanner;

public class Prostoe {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean result = prostoe(n);
    if (result == false)
        System.out.println("простое");
    else
        System.out.println("Не простое");


    }
    public static boolean prostoe(int x){
        boolean simple = false;
        for (int i =2;i<=Math.sqrt(x);i++){
            if (x%i==0){
                simple = true;
                break;
                
            }
        }
        return simple;

    }
    
}
