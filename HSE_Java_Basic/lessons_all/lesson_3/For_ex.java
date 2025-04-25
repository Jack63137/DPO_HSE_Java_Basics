package HSE_Java_Basic.lessons_all.lesson_3;


public class For_ex {
    public static void main(String[] args) {
        int j =0;
        for(int i = 1; i<=1000000;i ++){
            if(i/100000+i/10000%10+i/1000%10 == i/100%10+i/10%10+i%10){
                System.out.printf("%06d\n",i);
                j++;
            }
            
        }
        System.out.println(j);

    }
}
