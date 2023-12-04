package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int numberLength = 1;
        for (int i = 0; i <= lengthOfLastNumber; i++) {
            if(i <= 0){
                result = 0;
            }else {
                result += numberLength*9;
                numberLength *= 10;
                if(numberLength % 10 != 1){
                    numberLength++;
                }
            }
        }
        System.out.println(result);
    }
}
