import java.util.HashMap;
import java.util.*;
import java.lang.*;

class MostOccuredEle
{
    public static int findMostRepeatedNumber(int[] arr) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (hashmap.containsKey(arr[i])) {
                hashmap.put(arr[i], hashmap.get(arr[i]) + 1);
            } else {
                hashmap.put(arr[i], 1);
            }
        }

        int maxFreq = 0;
        int mostRepeatedNumber = 0;
        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostRepeatedNumber = entry.getKey();
            }
        }

        return mostRepeatedNumber;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 10, 10, 10};
        int mostRepeatedNumber = findMostRepeatedNumber(arr);
        System.out.println("The most repeated number is: " + mostRepeatedNumber);
    }
}