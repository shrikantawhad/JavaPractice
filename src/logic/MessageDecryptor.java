package logic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MessageDecryptor {

    public static void main(String[] args) {
        String encodedMessage = "t2e1st This i1s f1irs1t";
        String decryptedMessage = decryptMessage(encodedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }

    public static String decryptMessage(String encodedMessage) {
        // Split the message into words
        String[] words = encodedMessage.split("\\s+");

        // Create a map to store key-value pairs
        Map<Integer, String> keyValueMap = new HashMap<>();

        // Process each word and create key-value pairs
        for (String word : words) {
            int key = calculateKey(word);
            keyValueMap.put(key, word.replaceAll("[0-9]", ""));
        }

        // Sort the words based on ascending order of keys
        int[] sortedKeys = keyValueMap.keySet().stream().mapToInt(Integer::intValue).sorted().toArray();

        // Arrange words based on sorted keys, keeping the later word in case of ties
        StringBuilder decryptedMessage = new StringBuilder();
        for (int key : sortedKeys) {
            decryptedMessage.append(keyValueMap.get(key)).append(" ");
        }

        // Remove trailing whitespace
        return decryptedMessage.toString().trim();
    }

    private static int calculateKey(String word) {
        int key = 0;
        for (char character : word.toCharArray()) {
            if (Character.isDigit(character)) {
                key += Character.getNumericValue(character);
            }
        }
        return key;
    }
}
