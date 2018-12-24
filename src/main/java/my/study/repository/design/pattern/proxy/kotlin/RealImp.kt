package my.study.repository.design.pattern.proxy.kotlin

/**
 * @author djh on  2018/10/15 19:26
 * @E-Mail 1544579459@qq.com
 */
class RealImp : Subject {
    override fun someMethod() {
        println("这是真实实现的业务方法!")
    }
}