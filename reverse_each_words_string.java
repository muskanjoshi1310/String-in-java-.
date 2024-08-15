class ReverseWordsWithLoop {

    /**
     * Reverses each word in the given string while word order using loops.
     
     */
    public static String reverseEachWord(String s) {
        // Trim the string to remove leading and trailing whitespace
        s = s.trim();
        
        // Initialize variables
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        boolean inWord = false;
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isWhitespace(c)) {
                // If a whitespace character is found and we were in a word
                if (inWord) {
                    // Reverse the current word and append to result
                    result.append(currentWord.reverse().toString()).append(" ");
                    // Reset the current word
                    currentWord.setLength(0);
                    inWord = false;
                }
            } else {
                // Append the character to the current word
                currentWord.append(c);
                inWord = true;
            }
        }
        
        // Handle the last word if present
        if (inWord) {
            result.append(currentWord.reverse().toString());
        }
        
        // Convert result to string and return
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "happy girl";
        String output = reverseEachWord(input);
        System.out.println("Output: " + output);  // Output: "avaJ sI mrofetalP tnednepednI"
    }
}
