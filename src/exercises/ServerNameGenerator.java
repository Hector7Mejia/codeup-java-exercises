package exercises;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"adorable", "adventurous", "aggressive", "agreeable", "alert", "alive", "amused", "angry", "annoyed", "annoying"};
        String[] nouns = {"area", "book", "business", "hand", "child", "company", "country", "day", "eye", "fact"};
       String adjective = getRandomElementFromStringArray(adjectives);
        String noun = getRandomElementFromStringArray(nouns);
        System.out.println("Here is your server name:\n" + adjective + "-" + noun);

    }

    private static String getRandomElementFromStringArray(String[] stringArray) {
        int index = (int) Math.floor(Math.random() * stringArray.length);

        return stringArray[index];
    }



}
