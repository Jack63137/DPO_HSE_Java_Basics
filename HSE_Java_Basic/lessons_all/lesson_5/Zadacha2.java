package HSE_Java_Basic.lessons_all.lesson_5;

public class Zadacha2 {
    public static void main(String[] args) {
        String s = "Аргентина манит негра окно ";
        s = s.toLowerCase();
        String[] words = s.split(" ");
        
        //String res = "";
        StringBuilder sb = new StringBuilder();

        for(String i:words){
            if(i.charAt(0)!=i.charAt(i.length()-1))
                //res = res + i + " ";
                sb.append(i + " ");

        }
        System.out.println(sb.toString());

    }
}
