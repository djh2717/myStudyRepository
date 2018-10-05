package my.study.repository.design.pattern.decorator.kotlin

/**
 * @author djh on  2018/10/2 20:40
 * @E-Mail 1544579459@qq.com
 */
class ConcreteComponent : BaseComponent {
    override fun operator() {
        println("基础行为!")
    }
}