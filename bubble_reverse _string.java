
     class BubbleSortReverseString {

        /**
         * Reverses a string using the bubble sort algorithm.
         *
         * @param s The input string.
         * @return The reversed string.
         */
        public static String reverseString(String s) {
            // Convert string to character array
            char[] chars = s.toCharArray();
            
            int n = chars.length;
            
            // Apply bubble sort to sort the characters in reverse order
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    // Swap characters if they are not in reverse order
                    if (chars[j] < chars[j + 1]) {
                        char temp = chars[j];
                        chars[j] = chars[j + 1];
                        chars[j + 1] = temp;
                    }
                }
            }
            
            // Convert character array back to string
            return new String(chars);
        }
    
        public static void main(String[] args) {
            String input = "I'm cute girl";
            String output = reverseString(input);
            System.out.println("Reversed String: " + output);  // Output: "ubrtSllooB"
        }
    }
    
    

