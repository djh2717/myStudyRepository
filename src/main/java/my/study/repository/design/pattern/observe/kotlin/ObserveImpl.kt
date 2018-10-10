package my.study.repository.design.pattern.observe.kotlin

/**
 * @author djh on  2018/10/10 17:00
 * @E-Mail 1544579459@qq.com
 */
class ObserveImpl(
        private val list: MutableList<Int>
) : Observe {
    
    override fun dataUpdate() {
        println("Data set is change, the last element is ${list.last()}")
    }
}