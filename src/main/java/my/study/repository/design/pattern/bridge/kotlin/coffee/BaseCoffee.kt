package my.study.repository.design.pattern.bridge.kotlin.coffee

import my.study.repository.design.pattern.bridge.kotlin.additive.BaseAdditive


/**
 * @author djh on  2018/10/4 17:38
 * @E-Mail 1544579459@qq.com
 */
abstract class BaseCoffee(protected val baseAdditive: BaseAdditive) {

    abstract fun showCoffeeInfo()
}