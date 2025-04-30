package HSE_Java_Basic.lessons_all.lesson_4;

import java.util.Arrays;
import java.util.Random;

public class Dz_3 {
    public static void main(String[] args) {
        int data[] = new int[365]; //Дни
        int counters[] = new int[8]; // счетчик количества
        Random rnd = new Random();

        //Заполнение массива направлением ветра
        for(int i = 0; i<data.length;i++){ 
            int dir = rnd.nextInt(8);
            counters[dir]++;
        }

        //Находим наименьшее 
        int minValue = counters[0];
        int minIndex = 0;
        for (int j = 1; j < counters.length; j++) {
            if (counters[j] < minValue) {
                minValue = counters[j];
                minIndex = j;
    }
}

        System.out.println(Arrays.toString(counters)); //Весь массив
        System.out.println(minValue); //наименьшее число
        System.out.println(minIndex); //наименьший индекс

        String str = " ветер был наименьшим в течении года! ";
        String[] dirs = {"Северный","Южный","Восточный","Западный","Север-западный","Северо-восточный","Юго-западный","Юго-восточный"};
        System.out.println(dirs[minIndex]+str);
        
    }
}
