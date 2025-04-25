package HSE_Java_Basic.lessons_all.lesson_4;

public class Fibonachi {
    public static void main(String[] args) {
    long x = fib(9);
    System.out.println(x);



    }
    public static long fib(long index){
    if(index ==0)
        return 0;
    else if(index ==1)
        return 1;
    return fib(index -1)+fib(index -2);

    }
}
