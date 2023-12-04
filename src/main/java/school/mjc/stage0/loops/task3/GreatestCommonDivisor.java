package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gdc = 1;
        for (int i = 1; i <= (first>second?first:second); i++) {
            if(first%i == 0 && second %i == 0){
                gdc = i;
            }
        }
        System.out.println(gdc);
    }
}
