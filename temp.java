import java.util.HashMap;

public class temp {
    public static void intToRoman(int num) {
        // String symbol[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",
        // "V", "IV", "I"};
        String res="";

        // num=1994

        HashMap<String, Integer> symbol = new HashMap<>();
        symbol.put("M", 1000);
        symbol.put("CM", 900);
        symbol.put("D", 500);
        symbol.put("C", 100);
        symbol.put("XC", 90);
        symbol.put("L", 50);
        symbol.put("XL", 40);
        symbol.put("X", 10);
        symbol.put("IX", 9);
        symbol.put("V", 5);
        symbol.put("IV", 4);
        symbol.put("I", 1);

        int temp = 0;
        for (String i : symbol.keySet()) {
            String key = i;
            int val = symbol.get(i);
            // System.out.println("key: " + key + " value: " + val);
            if (num - val > temp) 
                temp = num - val;
            
            //temp=994
            res+=key;
        }

    }

    public static void main(String[] args) {
        intToRoman(1);
    }
}
