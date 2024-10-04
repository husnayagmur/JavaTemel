import java.util.Arrays;
public class StringSinifiVeMetotlari {
    public static void main(String[] args) {
        String str="patika";
        System.out.println(str.charAt(2));//2. indisteki elemani verir.
        System.out.println(str.codePointAt(1));//2. indisteki elemani verir.
        System.out.println(str.concat(".dev"));//kelime sonuna eleman ekler.
        System.out.println(str.contains("at"));//str degiskeninin icinde at varmi
        System.out.println(str.endsWith("a"));//a ile bitmis mi?
        System.out.println(str.equals("aa"));//esit mi degil mi diye sorar
        System.out.println(str.isEmpty());//bir dizenin bos olup olmadigini kontrol eder.
        System.out.println(str.replace("a","b"));//degistirmek anlamina gelir. a lari b yap
        String[] sp=str.split("a");//a lari cikartir ve a haricini bolerek bir diziye atar.
        System.out.println(Arrays.toString(sp));
    }
}
