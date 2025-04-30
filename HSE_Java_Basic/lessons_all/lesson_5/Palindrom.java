package HSE_Java_Basic.lessons_all.lesson_5;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("Аргентина манит негра"));

    }
    private static boolean isPalindrom(String s){
        if (s==null)
            return false;

        s = s.toLowerCase().replace(" ", "").replace("ё", "е");
        
        int l = s.length();
        for (int i=0,j=l-1;i<l/2;i++,j--)
            if(s.charAt(i)!=s.charAt(j))
                return false;
        return true;
    }
}
