package HSE_Java_Basic.lessons_all.lesson_7.alive;

public class Dog extends Animal {

    public Dog(String name,int age){
        super(name,age);
    }
    public Dog(String name){
        super(name);
        setAge(0);
    }

    public void talk(){
        System.out.println("Гав-гав");
    }
    
}
