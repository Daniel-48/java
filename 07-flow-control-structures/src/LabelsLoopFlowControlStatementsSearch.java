public class LabelsLoopFlowControlStatementsSearch {
    public static void main(String[] args) {
        int quantity = 0;
        char letter = 'e';
        String word = "Gael";
        String sentence = "In April our son Gael will be born. He is the best thing that has ever happened to me";
        int wordLength = word.length();
        int sentenceLength = sentence.length() - wordLength;
        System.out.println("sentence = " + sentence);

        System.out.println("The word to search for is 'Gael'");
        search:
        for (int i = 0; i <= sentenceLength; i++) {
            int k = i; // Auxiliary variable to increment without modifying the value of the variable i
            for (int j = 0; j < wordLength; j++) {
                if (sentence.charAt(k++) != word.charAt(j)) {
                    continue search;
                }
            }
            quantity++;
        }
        System.out.println("The word " + "'" + word + "'" + " has been found " + quantity + " times in the sentence");

        System.out.println("The character to search for is 'e'");
        for (int i = 0; i < sentenceLength; i++) {
            if (sentence.charAt(i) != letter) {
                continue;
            }
            quantity++;
        }
        System.out.println("The character " + "'" + letter + "'" + " has been found " + quantity + " times in the sentence");
    }
}
