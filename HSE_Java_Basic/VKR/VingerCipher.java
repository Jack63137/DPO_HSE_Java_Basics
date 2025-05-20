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
        int i = 0;
        int offset = 0;

        CaesarCipher caesarCipher = new CaesarCipher(true);
        StringBuilder result = new StringBuilder();
        char[] key_arr = key.toCharArray();
        String final_char;

        for (char c: text.toCharArray()) {
            
            if(i>= key.length()) i = 0;
            int ch = caesarCipher.getCharPosition(c);
            offset = caesarCipher.getCharPosition(key_arr[i]);
            if(ch != -1)
            {
                if (encr) {final_char = caesarCipher.encrypt(String.valueOf(c), offset);}
                else {final_char = caesarCipher.decrypt(String.valueOf(c), offset);}

                result.append(final_char);
            } else {
                i--;
                result.append(c);
            }
                
            i++;
            }
        return result.toString();
    }
}