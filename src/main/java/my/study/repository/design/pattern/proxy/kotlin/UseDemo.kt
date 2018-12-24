package my.study.repository.design.pattern.proxy.kotlin

/**
 * @author djh on  2018/10/15 19:24
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val proxyMen = ProxyMen()
        proxyMen.someMethod()
    }
}