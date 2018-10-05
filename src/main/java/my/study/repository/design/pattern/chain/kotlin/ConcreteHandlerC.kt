package my.study.repository.design.pattern.chain.kotlin

/**
 * @author djh on  2018/10/4 18:26
 * @E-Mail 1544579459@qq.com
 */
class ConcreteHandlerC : AbstractHandler() {
    override fun handlerRequest(money: Int) {
        println("总结处理者, $money 万, 买宝马7系,恭喜发财!")
    }
}