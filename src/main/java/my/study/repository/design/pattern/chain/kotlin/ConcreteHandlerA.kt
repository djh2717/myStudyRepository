package my.study.repository.design.pattern.chain.kotlin

/**
 * @author djh on  2018/10/4 18:23
 * @E-Mail 1544579459@qq.com
 */
class ConcreteHandlerA : AbstractHandler() {
    override fun handlerRequest(money: Int) {
        if (money < 30) {
            println("$money,少于30万,可以买宝马2系,买车成功!")
        } else {
            nextHandler.handlerRequest(money)
        }
    }
}