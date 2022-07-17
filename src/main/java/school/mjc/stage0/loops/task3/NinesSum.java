package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int nineSum = 0;
        int order = 1;
        for (int i=1;i<=lengthOfLastNumber;i++) {
            nineSum += (order*10)-1;
            order = order*10;
        }
        System.out.println(nineSum);
    }
}
