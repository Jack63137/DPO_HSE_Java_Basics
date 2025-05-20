package HSE_Java_Basic.VKR;

class AtbashCipher {
    private static final String ru_alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public static String encrypt(String text) {
        return process(text);
    }

    public static String decrypt(String text) {
        return process(text); 
    }

    private static String process(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    // Верхний регистр
                    int index = ru_alphabet.indexOf(c);
                    if (index != -1) {
                        // Русский верхний регистр
                        result.append(ru_alphabet.charAt(ru_alphabet.length() - index -1));
                    }else{
                    // Английский верхний регистр
                    char encrypted = (char)('Z' + 'A' - c);
                    result.append(encrypted);}
                } else {
                    // Нижний регистр
                    int index = ru_alphabet.indexOf(Character.toUpperCase(c));// приводим к верхнему регистру и сравниваем
                    if (index != -1) {
                        // Русский нижний регистр
                        result.append(Character.toLowerCase(ru_alphabet.charAt(ru_alphabet.length() - index -1))); // приводим обратно к нижнему
                    } else{
                    // Английский нижний регистр
                    char encrypted = (char)('z' + 'a' - c);
                    result.append(encrypted);}
                }
            } else {
                // Не буква
                result.append(c);
            }
        }
        return result.toString();
    }
}