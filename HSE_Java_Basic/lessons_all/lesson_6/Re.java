package HSE_Java_Basic.lessons_all.lesson_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re {
    public static void main(String[] args) {
        String s = "Имена, фамилии и отчества. Примеры: брат Константин, инженер Петрухин, директор Иван Владимирович.\n" + //
                        "Прозвища, в том числе исторических лиц: Ричард Львиное Сердце, вор по кличке Фокс.\n";

        Pattern p = Pattern.compile("\\b[А-ЯЁ][а-яА-Я-]*\\b");
        Matcher m = p.matcher(s);

        while (m.find())
            System.out.println(m.group());
    }
}
