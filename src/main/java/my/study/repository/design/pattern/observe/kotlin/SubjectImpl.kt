package my.study.repository.design.pattern.observe.kotlin

/**
 * @author djh on  2018/10/10 17:01
 * @E-Mail 1544579459@qq.com
 */
class SubjectImpl : Subject {
    
    override val list: MutableList<Observe> = arrayListOf()
    
    override fun registerObserve(observe: Observe) {
        list.add(observe)
    }
    
    override fun unRegisterObserve(observe: Observe) {
        list.remove(observe)
    }
    
    override fun notifyDataChange() {
        list.forEach {
            it.dataUpdate()
        }
    }
}