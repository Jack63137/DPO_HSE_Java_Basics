package HSE_Java_Basic.lessons_all.lesson_3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        boolean isRigth = false;
        Scanner in = new Scanner(System.in);
        int n;

        do{
            System.out.print("n:");
            isRigth = in.hasNextInt();
            if (isRigth){
                n = in.nextInt();
                for (;n>1;){
                    if (n%2==0){
                        n = n/2;
                    }
                    else{
                        n = n*3+1;
                    }
                    System.out.println(n);

                }
            }
            else
                
                System.out.println("ошибка ввода, повторит...");
                in.next();
        }
        while(!isRigth);


    }
}
