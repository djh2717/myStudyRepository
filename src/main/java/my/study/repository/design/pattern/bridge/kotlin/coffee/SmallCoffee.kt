package my.study.repository.design.pattern.bridge.kotlin.coffee

import my.study.repository.design.pattern.bridge.kotlin.additive.BaseAdditive


/**
 * @author djh on  2018/10/4 17:48
 * @E-Mail 1544579459@qq.com
 */
class SmallCoffee(baseAdditive: BaseAdditive) : BaseCoffee(baseAdditive) {

    override fun showCoffeeInfo() {
        println("小杯 $baseAdditive 咖啡")
    }

}