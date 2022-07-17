package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first=0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        int third = first + second;
        for (int i = 1; i<=lastFibonacci-2; i++) {
            third = first + second;
            first = second;
            second = third;
            System.out.println(third);
        }
    }
}
