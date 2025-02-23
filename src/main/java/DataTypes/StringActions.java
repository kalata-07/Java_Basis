package DataTypes;

public class StringActions {
    public static void main(String[] args) {
        String testString = "My test string";
        System.out.println(testString.charAt(1));
        System.out.println(testString.contains("str"));
        System.out.println(testString.equals("sgf"));
        System.out.println(testString.length());

        String [] stringArray = testString.split(" ");
        System.out.println(testString + " has "+ stringArray.length + " words.");
        System.out.println(String.format("%s has %d words", testString, stringArray.length));
    }
}
