import java.util.*;

public class Rim {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(3, "III");
        map.put(2, "II");
        map.put(1, "I");
    }

    private static List<String> roman = new ArrayList<String>();

    static {
        roman.add("Нулевой индекс");
        roman.add("I");
        roman.add("II");
        roman.add("III");
        roman.add("IV");
        roman.add("V");
        roman.add("VI");
        roman.add("VII");
        roman.add("VIII");
        roman.add("IX");
        roman.add("X");
    }

    public final static String toRoman(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number - l);
    }


    public static int toArabic(String num) {
        return roman.indexOf(num);
    }
}

