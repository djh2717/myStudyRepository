package my.study.repository.design.pattern.strategy.kotlin

/**
 * @author djh on  2018/10/15 19:36
 * @E-Mail 1544579459@qq.com
 */
class Context {
    fun calculate(strategy: (distance: Int) -> Float, distance: Int): Float = strategy(distance)
}