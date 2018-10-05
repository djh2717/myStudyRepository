package my.study.repository.design.pattern.bridge.kotlin

import my.study.repository.design.pattern.bridge.kotlin.additive.MilkAdditive
import my.study.repository.design.pattern.bridge.kotlin.additive.SugarAdditive
import my.study.repository.design.pattern.bridge.kotlin.coffee.LargeCoffee
import my.study.repository.design.pattern.bridge.kotlin.coffee.SmallCoffee


/**
 * @author djh on  2018/10/4 17:35
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {

    @JvmStatic
    fun main(args: Array<String>) {

        val largeCoffee = LargeCoffee(MilkAdditive())
        print("卖出了")
        largeCoffee.showCoffeeInfo()

        val smallCoffee = SmallCoffee(SugarAdditive())
        print("卖出了")
        smallCoffee.showCoffeeInfo()
    }
}