import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchDosya {
    public static void main(String[] args) throws IOException /*throws FileNotFoundException*/{
        BufferedReader reader=null;
        try {
            new BufferedReader(new FileReader("C:\\Users\\PC\\Desktop\\JAVA\\java101\\src\\sayilar.txt"));
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }finally {
            reader.close();
        }
        //ya throw fırlatırım ya da try catch al diyor.
    }
}
