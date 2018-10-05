package my.study.repository.design.pattern.adapter.kotlin

/**
 * @author djh on  2018/10/4 16:12
 * @E-Mail 1544579459@qq.com
 */
class ObjectAdapter(
        private val src: Src
) : Dst {

    override fun mobileCharge(): Int {
        println("开始适配电压!")
        val voltage = src.standardVoltage() / 4
        println("适配后的电压: $voltage")
        return voltage
    }
}