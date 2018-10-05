package my.study.repository.design.pattern.decorator.kotlin

/**
 * @author djh on  2018/10/2 20:41
 * @E-Mail 1544579459@qq.com
 */
class DecorateA
(private val concreteComponent: ConcreteComponent = ConcreteComponent())
    : BaseComponent by concreteComponent {

    override fun operator() {
        concreteComponent.operator()
        decorateMethod()
    }

    private fun decorateMethod() {
        println("装饰方法!")
    }
}