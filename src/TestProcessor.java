public class TestProcessor {
    public static void main(String[] args) {

        //countWords("I love my family");
        //reverseString("Hello Giraffe");
        addSpaces("HelloTtsTimeToStudy");

    }

    /**
     * Split a string into an array by tokenizing it
     * counts words and prints them
     * @param text full string to be split
     */
    public static void countWords (String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words: ", numberOfWords);
        System.out.println(message);
        for (int i = 0; i < numberOfWords; i++){
            System.out.println(words[i]);
        }

    }

    /**
     * Print a string in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){

        for (int i = text.length()-1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Adds spaces before each uppercase letter
     * @param text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < text.length(); i++){
            if(i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

}
