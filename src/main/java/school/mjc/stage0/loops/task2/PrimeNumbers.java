package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive < 2) {
            return;
        }
        int i = 1;
        while (++i <= printToInclusive) {
            int j = i;
            while (--j > 1) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == 1) {
                System.out.println(i);
            }
        }
    }
}
