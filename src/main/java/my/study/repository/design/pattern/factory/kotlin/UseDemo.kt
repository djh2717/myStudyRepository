package my.study.repository.design.pattern.factory.kotlin

/**
 * @author djh on  2018/10/5 18:53
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val bmwThree = getBmwThree()
        val bmwSix = getBmwSix()
    
        bmwThree.speak()
        bmwSix.speak()

    }
}