package my.study.repository.design.pattern.adapter.kotlin

/**
 * @author djh on  2018/10/4 16:16
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {

    private class Mobile {
        fun startCharge(voltage: Int) {
            if (voltage == 55) {
                println("电压适配成功,开始充电!")
            } else {
                println("$voltage V 电压太高!")
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val objectAdapter = ObjectAdapter(Src())
        val mobile = Mobile()
        mobile.startCharge(objectAdapter.mobileCharge())
    }
}