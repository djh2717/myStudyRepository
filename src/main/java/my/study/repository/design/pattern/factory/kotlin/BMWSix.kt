package my.study.repository.design.pattern.factory.kotlin

/**
 * @author djh on  2018/10/5 18:54
 * @E-Mail 1544579459@qq.com
 */
class BMWSix(private val price: Int) : BMW {
    override fun speak() {
        println("我是宝马六系! 价格$price")
    }
}