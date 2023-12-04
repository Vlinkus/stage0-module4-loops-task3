package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int numberLength = String.valueOf(t).length();
        int number = t < 0 ? t*(-1) : t ;
        int divider = 1;
        int result = 0;
        for (int i = 1; i < numberLength; i++) {
            divider *= 10;
        }
        for (int i = numberLength; i > 0 ; i--) {
            result += number/divider;
            number = number%divider;
            divider /= 10;
        }
        System.out.println(result);
    }
}
