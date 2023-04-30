package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        int steps = multiplyByAndToInclusive > 0 ? multiplyByAndToInclusive : -multiplyByAndToInclusive;

        int i = -1;
        while (++i <= steps) {
            System.out.println(multiplyByAndToInclusive * i);
        }
    }
}
