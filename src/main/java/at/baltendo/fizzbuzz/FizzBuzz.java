package at.baltendo.fizzbuzz;

import at.baltendo.fizzbuzz.util.StringBuilderFactory;

public class FizzBuzz {

    private static final String SEPARATOR = "\\s+";
    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String SPACE = " ";

    public String transform(String input) {
        return transformWithStringBuilder(input);
    }

    String transformWithStringConcatenation(String input) {
        if (input == null) {
            return null;
        }

        String[] words = input.split(SEPARATOR);
        String result = "";

        for (int i = 0; i < words.length; i++) {
            int position = i + 1;

            if (position % 3 == 0) {
                result += FIZZ;
            } else if (position % 5 == 0) {
                result += BUZZ;
            } else {
                result += words[i];
            }

            result += SPACE;
        }

        return result.trim();
    }

    String transformWithStringBuilder(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder builder = StringBuilderFactory.withEstimatedCapacity(input);
        String[] words = input.split(SEPARATOR);

        for (int i = 0; i < words.length; i++) {
            int position = i + 1;

            if (position % 3 == 0) {
                builder.append(FIZZ);
            } else if (position % 5 == 0) {
                builder.append(BUZZ);
            } else {
                builder.append(words[i]);
            }

            builder.append(SPACE);
        }

        return builder.toString().trim();
    }
}
