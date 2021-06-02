package EjercicioMañana;

public class StringUtil {
    public static String rpad(String s, char c, int n) {
        String stringToConcat = "";
        for (int i = 0; i < n; i++) {
            stringToConcat = stringToConcat.concat(String.valueOf(c));
        }
        return s + stringToConcat;
    }

    public static String ltrim(String s) {
        return s.replaceAll("^\\s+", "");
    }

    public static String rtrim(String s) {
        return s.replaceAll("\\s+$", "");
    }

    public static String trim(String s) {
        return ltrim(rtrim(s));
    }

    public static int indexOfN(String s, char c, int n) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                n = n - 1;
                if (n == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

}