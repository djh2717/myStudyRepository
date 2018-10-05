package my.study.repository.design.pattern.builder.kotlin

/**
 * @author djh on  2018/10/3 20:32
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val builder = ComplexObject.Builder().apply {
            setAge(21)
            setSex("boy")
            setName("djh")
            setFatherName("dxb")
        }
        val complexObject = builder.build()
        println(complexObject.mAge)
    }
}