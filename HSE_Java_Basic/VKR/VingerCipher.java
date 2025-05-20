package HSE_Java_Basic.VKR;

class VingerCipher {

    public VingerCipher(){
        
    }
    public String encrypt(String text, String key){
        return process(text, key, true);
    }

    public String decrypt(String text, String key){
        return process(text, key, false);
    }

    private String process(String text, String key, boolean encr){
        int i = 0; // Счетчик ключа
        int offset = 0; // Смещение буквы относительно начала

        CaesarCipher caesarCipher = new CaesarCipher(true);
        StringBuilder result = new StringBuilder();
        char[] key_arr = key.toCharArray(); // Разбитие ключа на буквы
        String final_char;

        for (char c: text.toCharArray()) {
            
            if(i>= key.length()) i = 0; // Обнуление ключа
            int ch = caesarCipher.getCharPosition(c); // Смещение буквы текста относительно начала алфавита
            offset = caesarCipher.getCharPosition(key_arr[i]); // Смещение буквы ключа относительно начала алфавита
            if(ch != -1) //-1 не буква
            {
                // Выбор режима взависимости от флага
                if (encr) {final_char = caesarCipher.encrypt(String.valueOf(c), offset);} 
                else {final_char = caesarCipher.decrypt(String.valueOf(c), offset);}

                result.append(final_char);
            } else {
                i--; // не использовать эту букву ключа для не букв
                result.append(c);
            }
            i++;
            }
        return result.toString();
    }
}