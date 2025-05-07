package HSE_Java_Basic.lessons_all.lesson_7.alive;

import HSE_Java_Basic.lessons_all.lesson_7.interfaces.Talkable;

public abstract class Animal extends Object implements Talkable{

    
    protected String name;
    protected int age;

    public Animal(String name,int age){
        this(name);
        setAge(age);
    }
    public Animal(String name){
        this.name =name;
        setAge(0);
    }

    public void setAge(int value){
        if (value>0)
            age = value;
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.printf("Кличка: %s, возраст %d\n",name,age);

    }

    public void newYear(){
        age++;
    }

    public abstract void talk();


}
