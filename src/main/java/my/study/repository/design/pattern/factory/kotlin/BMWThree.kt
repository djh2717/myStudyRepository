package my.study.repository.design.pattern.factory.kotlin

/**
 * @author djh on  2018/10/5 18:55
 * @E-Mail 1544579459@qq.com
 */
class BMWThree(private val price: Int) : BMW {
    override fun speak() {
        println("我是宝马三系! 价格$price 万")
    }
}