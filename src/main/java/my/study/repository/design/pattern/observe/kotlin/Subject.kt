package my.study.repository.design.pattern.observe.kotlin

/**
 * @author djh on  2018/10/10 17:00
 * @E-Mail 1544579459@qq.com
 */
interface Subject {
    val list: MutableList<Observe>
    
    fun registerObserve(observe: Observe)
    
    fun unRegisterObserve(observe: Observe)
    
    fun notifyDataChange()
}