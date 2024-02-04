import java.util.HashSet;

public class Main {
    public static boolean hasAllUniqueCharacters(String str) {
        HashSet<Character> characterSet = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!characterSet.add(c)) {
                // If the character is already in the set, it's not unique
                return false;
            }
        }

        // All characters are unique
        return true;
    }
    public static void main(String[] args) {
        String testString = "abcdefg";
        boolean result = hasAllUniqueCharacters(testString);

        System.out.println("Does the string have all unique characters? " + result);


    }
}