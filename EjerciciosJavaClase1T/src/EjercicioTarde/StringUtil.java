package EjercicioTarde;


public class StringUtil {
    public static String replicate(char c, int n) {
        String cadena = "";

        for (int i = 0; i < n; i++) {
            cadena += c;
        }

        return cadena;
    }

    public static String lpad(String s, int n, char c) {
        String cadena = "";
        int cerosFaltantes = n - s.length();

        cadena = replicate(c, cerosFaltantes);

        return cadena + s;
    }

    public static String[] toStringArray(int arr[]) {
        String[] stringArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            stringArr[i] = Integer.toString(arr[i]);
        }

        return stringArr;
    }

    public static int[] toIntArray(String arr[]) {
        int[] intArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        return intArr;
    }

    public static int maxLength(String arr[]) {
        int mayorCantChars = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > mayorCantChars) {
                mayorCantChars = arr[i].length();
            }
        }

        return mayorCantChars;
    }

    public static void lNormalize(String arr[], char c) {
        int maxCantChars = maxLength(arr);

        for (int i = 0; i < arr.length; i++) {
            String elem = arr[i];
            arr[i] = lpad(elem, maxCantChars, c);
        }

    }
}