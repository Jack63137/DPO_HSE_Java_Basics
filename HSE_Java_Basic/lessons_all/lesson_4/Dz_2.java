package HSE_Java_Basic.lessons_all.lesson_4;

import java.util.Arrays;
import java.util.Random;

public class Dz_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] mas = new int[20];
        int index = 0;
        while(index<mas.length){
            int n  = rnd.nextInt(22);
            boolean found = false;
            for (int i = 0; i<index;i++){
                if (mas[i]== n){
                    found = true;
                    break;
                }
            }
            if(!found){
                mas[index]=n;
                index++;
            }

        }
        System.out.println(Arrays.toString(mas));

    }
    
}
