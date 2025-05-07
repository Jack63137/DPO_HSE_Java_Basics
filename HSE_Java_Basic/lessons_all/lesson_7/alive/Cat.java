package HSE_Java_Basic.lessons_all.lesson_7.alive;

public class Cat extends Animal {

    public Cat(String name,int age){
        super(name,age);
    }
    public Cat(String name){
        super(name);
        setAge(0);
    }

    public void talk(){
        System.out.println("Мяу-мяу");
    }
}
