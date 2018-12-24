package my.study.repository.design.pattern.strategy.kotlin

/**
 * @author djh on  2018/10/15 19:30
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = Context()
    
        println("15公里 Bus 价格: ${context.calculate(Strategy.busPrice, 15)}")
    
        println("15公里 Taxi 价格: ${context.calculate(Strategy.taxiPrice, 15)}")
        
    }
}