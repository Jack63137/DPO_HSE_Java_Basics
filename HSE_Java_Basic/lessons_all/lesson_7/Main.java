package HSE_Java_Basic.lessons_all.lesson_7;
import HSE_Java_Basic.lessons_all.lesson_7.alive.Cat;
import HSE_Java_Basic.lessons_all.lesson_7.alive.Dog;
import HSE_Java_Basic.lessons_all.lesson_7.devices.Radio;
import HSE_Java_Basic.lessons_all.lesson_7.interfaces.Talkable;

public class Main {
    public static void main(String[] args){
        Talkable[] home = new Talkable[]{new Cat("Мурка",-1),new Cat("Барсик",7),new Dog("Шарик",7),new Radio()};

        // Talkable o = new Cat("Кузя");
        
        for(Talkable c: home){
            c.talk();
        }


        // Cat c = new Cat("Мурка",-7);

        // Cat c1 = new Cat("Барсик");
        // Dog d1 = new Dog("Вафля",9);
        

        // c.show();
        // c1.newYear();
        // c1.show();
        // c1.talk();
        // d1.talk();
    }
}
