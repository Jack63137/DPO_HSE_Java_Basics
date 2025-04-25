package HSE_Java_Basic.lessons_all.lesson_3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        System.out.println("n:");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()){
            int n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Понедельник"); break;
                case 2:
                    System.out.println("Вторник"); break;
                case 3:
                    System.out.println("Среда"); break;
                case 4:
                    System.out.println("Четверг"); break;
                case 5:
                    System.out.println("Пятница"); break;
                case 6:
                    System.out.println("Суббота"); break;
                case 7:
                    System.out.println("Воскресенье"); break;
                default:
                    System.out.println("Ошибка");
                    break;
            }
    }
    
}
}
