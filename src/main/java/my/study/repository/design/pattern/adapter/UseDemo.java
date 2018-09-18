package my.study.repository.design.pattern.adapter;

/**
 * @author djh on  2018/8/10 00:05
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    private static class Mobile {
        private void charge(int voltage) {
            if (voltage == 5) {
                System.out.println("电压匹配成功!");
            } else {
                System.out.println("高电压");
            }
        }
    }

    public static void main(String[] args) {
        ObjectAdapter objectAdapter = new ObjectAdapter(new Src());
        Mobile mobile = new Mobile();
        mobile.charge(objectAdapter.mobileCharge());
    }
}
