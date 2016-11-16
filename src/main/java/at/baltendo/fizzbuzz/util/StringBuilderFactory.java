package at.baltendo.fizzbuzz.util;

public class StringBuilderFactory {

    private StringBuilderFactory() {

    }

    public static StringBuilder withEstimatedCapacity(String input) {
        int estimatedCapacity = defaultCapacityEstimation(input);
        return new StringBuilder(estimatedCapacity);
    }

    static int defaultCapacityEstimation(String sentence) {
        return (int) (sentence.length() * 1.2);
    }
}
