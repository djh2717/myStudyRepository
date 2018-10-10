package my.study.repository.design.pattern.observe.kotlin

/**
 * @author djh on  2018/10/5 19:23
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val dataSet = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        
        val subject = SubjectImpl()
        
        val observeOne = ObserveImpl(dataSet)
        val observeTwo = ObserveImpl(dataSet)
        
        subject.registerObserve(observeOne)
        subject.registerObserve(observeTwo)
        
        println("Now the data start change!")
        
        dataSet.add(88)
        
        subject.notifyDataChange()
    }
}