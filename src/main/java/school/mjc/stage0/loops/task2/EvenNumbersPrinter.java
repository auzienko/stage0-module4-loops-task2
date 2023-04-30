package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int i = -1;
        while (++i <= printTillInclusive / 2) {
            System.out.println(i * 2);
        }
    }
}
