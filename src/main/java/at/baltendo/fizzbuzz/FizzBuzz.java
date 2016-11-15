package at.baltendo.fizzbuzz;

public class FizzBuzz {

    private static final String SPLITTER = "\\s+";
    private static final String FIZZ = "fizz";
    private static final String SPACE = " ";

    public String transform(String input) {
        return transformWithStringBuilder(input);
    }

    public String transformWithStringConcatenation(String input) {
        if (input == null) {
            return null;
        }

        String[] words = input.split(SPLITTER);
        String result = "";

        for (int i = 0; i < words.length; i++) {
            int position = i + 1;

            if (position % 3 == 0) {
                result += FIZZ;
            } else {
                result += words[i];
            }

            if (i < words.length -1) {
                result += SPACE;
            }
        }

        return result;
    }

    public String transformWithStringBuilder(String input) {
        if (input == null) {
            return null;
        }

        String[] words = input.split(SPLITTER);
        int estimatedLengthOfResult = estimateTransformedLength(input);
        StringBuilder builder = new StringBuilder(estimatedLengthOfResult);

        for (int i = 0; i < words.length; i++) {
            int position = i + 1;

            if (position % 3 == 0) {
                builder.append(FIZZ);
            } else {
                builder.append(words[i]);
            }

            if (i < words.length -1) {
                builder.append(SPACE);
            }
        }

        return builder.toString();
    }

    int estimateTransformedLength(String sentence) {
        return (int) (sentence.length() * 1.2);
    }
}
