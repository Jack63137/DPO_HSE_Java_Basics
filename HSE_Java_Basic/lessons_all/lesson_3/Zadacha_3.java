package HSE_Java_Basic.lessons_all.lesson_3;

import java.util.Arrays;
import java.util.Random;

public class Zadacha_3 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int count =0;
        Random rnd = new Random();
        for (int i = 0; i < A.length ; i++){
            if(rnd.nextInt(2)==1)
                A[i]= rnd.nextInt(100);
            else
                A[i]= -rnd.nextInt(100);
        }

        for(int j=1;j<A.length;j++){
            if(A[j-1]*A[j] < 0){
                count++;
            }
        }
        System.out.println(Arrays.toString(A));
        System.out.println(count);


    }
}
