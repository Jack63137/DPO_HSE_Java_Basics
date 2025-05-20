package HSE_Java_Basic.VKR;

public class CaesarCipher {
    boolean yo;
    // Constants for alphabet sizes
    private static final int RUSSIAN_ALPHABET_SIZE = 33;
    private static final int ENGLISH_ALPHABET_SIZE = 26;
    private static final String RUSSIAN_UPPER = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String RUSSIAN_LOWER = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public CaesarCipher(boolean yo) {
        this.yo = yo;
    }
    
    public String encrypt(String text, int key) {
        return process(text, key);
    }
    
    public String decrypt(String text,int key) {
        return process(text, -key);
    }
    
    private String process(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                int index = RUSSIAN_UPPER.indexOf(c);
                if (index != -1) {
                    // Русская заглавная буква
                    if (yo) {
                        int newIndex = (index + shift) % RUSSIAN_ALPHABET_SIZE;
                        if (newIndex < 0) newIndex += RUSSIAN_ALPHABET_SIZE;
                        result.append(RUSSIAN_UPPER.charAt(newIndex));
                    } else processEnglishChar(c, 'А', shift, result, 32);

                } else if (c >= 'A' && c <= 'Z') {
                    // Английская заглавная
                    processEnglishChar(c, 'A', shift, result, ENGLISH_ALPHABET_SIZE);
                } else {
                    result.append(c);
                }
            } else if (Character.isLowerCase(c)) {
                int index = RUSSIAN_LOWER.indexOf(c);
                if (index != -1) { 
                    // Русская строчная буква
                    if (yo) {
                        int newIndex = (index + shift) % RUSSIAN_ALPHABET_SIZE;
                        if (newIndex < 0) newIndex += RUSSIAN_ALPHABET_SIZE;
                        result.append(RUSSIAN_LOWER.charAt(newIndex));
                    } else processEnglishChar(c, 'а', shift, result, 32);
                } else if (c >= 'a' && c <= 'z') { 
                    // Английская строчная
                    processEnglishChar(c, 'a', shift, result, ENGLISH_ALPHABET_SIZE);
                } else {
                    result.append(c);
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public int getCharPosition(char c) {
        // Для русских букв с учетом буквы 'ё'
        if (yo) {
            if (Character.isUpperCase(c)) {
                int index = RUSSIAN_UPPER.indexOf(c);
                if (index != -1) {
                    return index; // Позиция в русском алфавите с 'ё'
                }
            } else if (Character.isLowerCase(c)) {
                int index = RUSSIAN_LOWER.indexOf(c);
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
        int offset = c - base;
        offset = (offset + shift) % alphabetSize;
        if (offset < 0) offset += alphabetSize; 
        result.append((char) (base + offset));
    }
   
    public static void main(String[] args) {

    }
}
