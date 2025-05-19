package HSE_Java_Basic.VKR;
public class Test {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher(true);
        VingerCipher vingerCipher = new VingerCipher();
        int s = caesarCipher.getCharPosition('c');
        System.out.println(s);
        String b = caesarCipher.encrypt("Hello world!", s);
        System.out.println(b);
        String c = vingerCipher.encrypt("Hello world!", "Key");
        System.out.println(c);
        String d = vingerCipher.decrypt(c, "Key");
        System.out.println(d);


    }
}
