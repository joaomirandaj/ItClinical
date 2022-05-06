import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReturnNthCharacter {

    public String returnNthCharacterFrom(String word, Integer nth) {
        if (nth < 1 || nth > word.length()) {
            return "";
        }

        StringBuilder newWord = new StringBuilder();
        Map<Character, Integer> characterCount = new LinkedHashMap<>();


        for (int i = nth - 1; i < word.length(); i = i + nth) {
            char character = word.charAt(i);

            if (Character.isUpperCase(character) ||
                    Character.isDigit(character) ||
                    Character.toString(character).matches("[^A-Za-z0-9]")) {
                newWord.append(character);

                int newCount;
                newCount = characterCount.getOrDefault(character, 0);
                characterCount.put(character, newCount + 1);



            }
        }
            characterCount.forEach((key, value)-> System.out.println(key + " = " + value));
            return newWord.toString();


        }
    }


