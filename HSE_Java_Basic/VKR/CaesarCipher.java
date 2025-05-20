package HSE_Java_Basic.VKR;

public class CaesarCipher {
    boolean yo;
    private static final String ru_alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public CaesarCipher(boolean yo) {
        this.yo = yo;
    }
    
    public String encrypt(String text, int key) {
        return process(text, key);
    }
    
    public String decrypt(String text,int key) {
        return process(text, -key);//дешефровка это смешение в обратную сторону
    }
    
    private String process(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                //Заглавные буквы
                int index = ru_alphabet.indexOf(c);
                if (index != -1) {
                    // Русская заглавная буква
                    if (yo) {
                        int newIndex = (index + shift) % ru_alphabet.length(); // смещаем
                        if (newIndex < 0) newIndex += ru_alphabet.length(); // если ушли в ноль
                        result.append(ru_alphabet.charAt(newIndex));
                    } else processEnglishChar(c, 'А', shift, result, 33); // без 'Ё'

                } else if (c >= 'A' && c <= 'Z') {
                    // Английская заглавная
                    processEnglishChar(c, 'A', shift, result, 26);
                } else {
                    // Заглавная незнакомый алфавит
                    result.append(c); 
                }
            } else if (Character.isLowerCase(c)) {
                //Строчные буквы
                int index = ru_alphabet.indexOf(Character.toLowerCase(c)); // приводим к нижнему регистру
                if (index != -1) { 
                    // Русская строчная буква
                    if (yo) {
                        int newIndex = (index + shift) % ru_alphabet.length(); // смещаем 
                        if (newIndex < 0) newIndex += ru_alphabet.length(); // если ушли в ноль
                        result.append(Character.toLowerCase(ru_alphabet.charAt(newIndex))); // приводим к нижнему регистру
                    } else processEnglishChar(c, 'а', shift, result, 32); // без 'ё'
                } else if (c >= 'a' && c <= 'z') { 
                    // Английская строчная
                    processEnglishChar(c, 'a', shift, result, 26);
                } else {
                    //Строчная назнакомый алфавит
                    result.append(c);
                }
            } else {
                //Не буквы
                result.append(c);
            }
        }
        return result.toString();
    }

    public int getCharPosition(char c) {
        // Для русских букв с учетом буквы 'ё'
        if (yo) {
            if (Character.isUpperCase(c)) {
                int index = ru_alphabet.indexOf(c);
                if (index != -1) {
                    return index; // Позиция в русском алфавите с 'Ё'
                }
            } else if (Character.isLowerCase(c)) {
                int index = ru_alphabet.indexOf(Character.toUpperCase(c));// для сравнивания приводим к верхнему регистру
                if (index != -1) {
                    return index; // Позиция в русском алфавите с 'ё'
                }
            }
        }
        
        // Для русских букв без учета буквы ё
        if ((c >= 'А' && c <= 'Я')) {
            return c - 'А';
        } else if (c >= 'а' && c <= 'я') {
            return c - 'а';
        }
        
        // Для английских букв
        if (c >= 'A' && c <= 'Z') {
            return c - 'A'; // Позиция в английском алфавите (заглавные)
        } else if (c >= 'a' && c <= 'z') {
            return c - 'a'; // Позиция в английском алфавите (строчные)
        }
        return -1; // Символ не относится к поддерживаемым алфавитам
    }
    
    
    private void processEnglishChar(char c, char base, int shift, StringBuilder result, int alphabetSize) {
        int offset = c - base; // разница между символами
        offset = (offset + shift) % alphabetSize; // смещение
        if (offset < 0) offset += alphabetSize; //если меньше нуля
        result.append((char) (base + offset));
    }
}
