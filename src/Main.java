public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 80, 100, 44);
        Fighter f2 = new Fighter("B", 10, 80, 100, 44);
        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
