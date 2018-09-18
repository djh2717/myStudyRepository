package my.study.repository.design.pattern.strategy;

/**
 * @author djh on  2018/9/12 16:12
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.println("13公里Taxi费用:" + context.calculate(new TaxiPrice(), 13));

        System.out.println("13公里Bus费用:" + context.calculate(new BusPrice(), 13));
    }
}
