package strategy;

/**
 * Created by Chan on 2017/3/26.
 */
public class Plus extends AbstractCalculator implements ICalculator {
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\+");
        return arrayInt[0] + arrayInt[1];
    }
}
