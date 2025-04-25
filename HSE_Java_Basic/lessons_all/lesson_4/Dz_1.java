package HSE_Java_Basic.lessons_all.lesson_4;

public class Dz_1 {
    public static void main(String[] args) {
        String[] animals = new String[]{"Крыса","Корова","Тигр","Заяц","Дракон","Змея","Лошадь","Овца","Обезьяна","Петух","Собака","Свенья"};
        String[] colors = new String[]{"Зеленый","Красный","Желтый","Белый","Синий"};
        int n = 2013;

        System.err.println(animals[(n-4)%12]);
        System.err.println(colors[(n-4)%10/2]);

    }
}
