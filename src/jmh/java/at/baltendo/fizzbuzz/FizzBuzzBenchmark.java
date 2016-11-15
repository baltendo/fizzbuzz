package at.baltendo.fizzbuzz;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@Warmup(iterations = 10, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 10, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@Fork(10)
public class FizzBuzzBenchmark {

    private static final String SENTENCE = "This is a sample sentence which should be transformed!";

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Benchmark
    public void transformWithStringConcatenationBenchmark() {
        fizzBuzz.transformWithStringConcatenation(SENTENCE);
    }

    @Benchmark
    public void transformWithStringBuilderBenchmark() {
        fizzBuzz.transformWithStringBuilder(SENTENCE);
    }
}
