package HSE_Java_Basic.lessons_all.lesson_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("n:");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()){
            int n = in.nextInt();

            int lastDigit = n % 10;
            int lastDigit2 = n % 100;

            String res = "Коровы";

            if ((11 <= lastDigit2 && lastDigit2 <=14) || lastDigit == 0 || lastDigit <=5)
                System.out.println("Коров");
            else
                if (lastDigit==1)
                System.out.println("корова");
            System.out.println(res);
        }
        else
        System.out.println("ошибка");
        
    }
}
