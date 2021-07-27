import java.lang.StringBuilder;

public class StringBuilderTest {
public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    String str = s.append("abc").toString();
    
    System.out.println(str);
}
}
