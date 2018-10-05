package my.study.repository.design.pattern.chain.kotlin

/**
 * @author djh on  2018/10/4 18:19
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val concreteHandlerA = ConcreteHandlerA()
        val concreteHandlerB = ConcreteHandlerB()
        val concreteHandlerC = ConcreteHandlerC()

        concreteHandlerA.nextHandler = concreteHandlerB
        concreteHandlerB.nextHandler = concreteHandlerC

        concreteHandlerA.handlerRequest(30)

    }
}