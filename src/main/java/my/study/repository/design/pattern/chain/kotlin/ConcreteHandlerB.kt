package my.study.repository.design.pattern.chain.kotlin

/**
 * @author djh on  2018/10/4 18:25
 * @E-Mail 1544579459@qq.com
 */
class ConcreteHandlerB : AbstractHandler() {
    override fun handlerRequest(money: Int) {
        if (money in 30..49) {
            println("${money}万,可以买宝马5系,买车成功!")
        } else {
            nextHandler.handlerRequest(money)
        }
    }
}