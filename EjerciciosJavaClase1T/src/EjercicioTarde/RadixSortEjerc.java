package EjercicioTarde;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc {
    public static int[] radixSort(int[] arr) {
        HashMap<Character, ArrayList<String>> hashMap = new HashMap<>(10);

        for (int i = 0; i < 10; i++) {
            hashMap.put(Integer.toString(i).charAt(0), new ArrayList<String>());
        }

        String[] cadenasArray = StringUtil.toStringArray(arr);

        StringUtil.lNormalize(cadenasArray, '0');

        int cantIteraciones = cadenasArray[1].length();

        for (int i = 0; i < cantIteraciones; i++) {

            for (String elem : cadenasArray) {

                char digitoAEnlistar = elem.charAt(cantIteraciones - i - 1);

                hashMap.get(digitoAEnlistar).add(elem);
            }
            ArrayList<String> arrStrAux = new ArrayList<>();
            for (Map.Entry<Character, ArrayList<String>> entry : hashMap.entrySet()) {
                for (String n : entry.getValue()) {
                    arrStrAux.add(n);
                }
                entry.getValue().clear();
            }

            cadenasArray = arrStrAux.toArray(new String[cadenasArray.length]);
        }

        arr = StringUtil.toIntArray(cadenasArray);
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        arr = radixSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }
    }
}