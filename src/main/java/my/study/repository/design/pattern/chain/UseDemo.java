package my.study.repository.design.pattern.chain;

/**
 * @author djh on  2018/9/16 20:23
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {

        ConcreteHandlerA concreteHandlerA = new ConcreteHandlerA();
        ConcreteHandlerB concreteHandlerB = new ConcreteHandlerB();
        ConcreteHandlerC concreteHandlerC = new ConcreteHandlerC();

        concreteHandlerA.mNextHandler = concreteHandlerB;
        concreteHandlerB.mNextHandler = concreteHandlerC;

        concreteHandlerA.handlerRequest(20);
    }
}
