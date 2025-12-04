package lab8_hashmap;

import java.util.HashMap;

public class FrequencyCounter {

    public HashMap<Character, Integer> countLetters(String sentence) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : sentence.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }
        return freq;
    }

    public void printFrequency(HashMap<Character, Integer> freq) {
        for (char c : freq.keySet()) {
            System.out.println(c + " = " + freq.get(c));
        }
    }
}
