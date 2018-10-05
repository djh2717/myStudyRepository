package my.study.repository.design.pattern.chain.kotlin

/**
 * @author djh on  2018/10/4 18:20
 * @E-Mail 1544579459@qq.com
 */
abstract class AbstractHandler {
    lateinit var nextHandler: AbstractHandler

    abstract fun handlerRequest(money: Int)
}