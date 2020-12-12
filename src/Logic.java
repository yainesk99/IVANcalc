import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {
    public static int a;
    public static int c;
    public static String b;
    public boolean fo = false;

    public void logic() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Pattern pattern = Pattern.compile("(.*)([-/+*])(.*)");
        Matcher matcher = pattern.matcher(str);
        matcher.find();

        try {
            a = Integer.parseInt(matcher.group(1));
            b = matcher.group(2);
            c = Integer.parseInt(matcher.group(3));
        } catch (NumberFormatException e) {
            a = Rim.toArabic(matcher.group(1));
            b = matcher.group(2);
            c = Rim.toArabic(matcher.group(3));
            fo = true;
        }

        int rezult;

        if (a < 1 || c > 10 || c < 1 || a > 10) {
            System.out.println("Принимаются значения только от 1 до 10");
            System.exit(0);
        }
        switch (b) {
            case "+":
                rezult = a + c;
                break;
            case "-":
                rezult = a - c;
                break;
            case "*":
                rezult = a * c;
                break;
            case "/":
                rezult = a / c;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + b);
        }
        if (fo) {
            String roman = Rim.toRoman(rezult);
            System.out.println(roman);
        } else {
            System.out.println(rezult);
        }
    }
}




