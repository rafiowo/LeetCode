import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int romanToInt = 0;

        for (int i = 0; i < roman.length(); i++) {
            int current = map.get(String.valueOf(roman.charAt(i)));

            if (i + 1 < roman.length()) {
                int next = map.get(String.valueOf(roman.charAt(i + 1)));
                if (current < next) {
                    romanToInt -= current;
                } else {
                    romanToInt += current;
                }
            } else {
                romanToInt += current;
            }
        }

        System.out.println(romanToInt);
    }
}