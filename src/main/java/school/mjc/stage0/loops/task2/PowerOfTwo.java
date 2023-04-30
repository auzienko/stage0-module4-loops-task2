package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }

        int i = -1;
        int lastResult = 1;
        while (++i <= power) {
            System.out.println(lastResult);
            lastResult = lastResult * 2;
        }
    }
}
