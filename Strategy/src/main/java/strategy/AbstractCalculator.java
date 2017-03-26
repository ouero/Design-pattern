package strategy;

/**
 * Created by Chan on 2017/3/26.
 */
public abstract class AbstractCalculator {
    public int[] split(String exp, String opt) {
        String[] array = exp.split(",");
        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
