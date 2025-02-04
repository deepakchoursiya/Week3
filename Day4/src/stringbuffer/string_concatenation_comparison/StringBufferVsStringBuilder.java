package stringbuffer.string_concatenation_comparison;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        // Measure time for StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " nanoseconds");

        // Measure time for StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " nanoseconds");

        // Compare results
        if (stringBufferTime > stringBuilderTime) {
            System.out.println("StringBuilder is faster by " + (stringBufferTime - stringBuilderTime) + " nanoseconds");
        } else {
            System.out.println("StringBuffer is faster by " + (stringBuilderTime - stringBufferTime) + " nanoseconds");
        }
    }
}
