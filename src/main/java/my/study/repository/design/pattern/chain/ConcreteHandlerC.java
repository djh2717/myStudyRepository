package my.study.repository.design.pattern.chain;

/**
 * @author djh on  2018/9/16 20:24
 * @E-Mail 1544579459@qq.com
 */
class ConcreteHandlerC extends AbstractHandler {


    @Override
    void handlerRequest(int money) {
        System.out.println("终极处理者,买到宝马7系,恭喜发财!!");
    }
}
