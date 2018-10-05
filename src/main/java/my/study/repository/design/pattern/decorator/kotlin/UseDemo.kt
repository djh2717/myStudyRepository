package my.study.repository.design.pattern.decorator.kotlin

/**
 * @author djh on  2018/10/2 20:48
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val decorateA = DecorateA()
        decorateA.operator()
    }
}