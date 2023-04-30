package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.println(1);
            return;
        }
        System.out.println(1);
        int i = 0;
        int lastResult = 1;
        while (++i <= printToInclusive) {
            lastResult = lastResult * i;
            System.out.println(lastResult);
        }
    }
}
