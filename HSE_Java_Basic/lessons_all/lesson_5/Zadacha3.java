package HSE_Java_Basic.lessons_all.lesson_5;
public class Zadacha3 {
    public static void main(String[] args) {
        String s = "Аргентина манит негра окно";
        s = s.toLowerCase();
        String[] words = s.split(" ");
        int max = words[0].length();
        String minstr = "";

        for(String i:words){
            if(i.length() < max){
                max = i.length();
                minstr = i;
            }
        }
        System.out.println(minstr);

    }
    
}
