package effectivejava.chapter9.item57;

public class ForLoops {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0, n = expensiveComputation(); i < n; i++) {
            count++;
        }
        System.out.printf("for loop called %d times.", count);
    }
    private static int expensiveComputation(){
        System.out.println("expensive computation called");
        return 10;
    }
}
