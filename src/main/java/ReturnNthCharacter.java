public class ReturnNthCharacter {

    public String returnNthCharacterFrom(String word, Integer nth) {
        if (nth < 1 || nth > word.length()) {
            return "";
        }

        StringBuilder newWord = new StringBuilder();

        for (int i = nth-1; i < word.length(); i=i+nth) {
            char character = word.charAt(i);

            if (Character.isUpperCase(character)) {
                newWord.append(character);
            }
        }

        return newWord.toString();
    }
}

