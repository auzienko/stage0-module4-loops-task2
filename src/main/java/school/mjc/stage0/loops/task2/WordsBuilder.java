package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int steps = chars.length;
        if (steps == 0) {
            return;
        }
        int i = -1;
        while (++i < steps) {
            System.out.print(chars[i]);
        }
    }
}
