package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0, second = 1, fib;
        System.out.println(first+"\n"+second);
        for (int i = 2; i < lastFibonacci; i++) {
            fib = first + second;
            System.out.println(fib);
            first =  second;
            second = fib;

        }
    }
}
