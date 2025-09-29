package characters;

public class Main {
    public static void main(String[] args) {
        String input = "catdog";

        characterCounter counter = new characterCounter(input);

        counter.permutations();
        counter.printPermutations();    
    }
}
