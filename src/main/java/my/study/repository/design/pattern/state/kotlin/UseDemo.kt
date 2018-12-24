package my.study.repository.design.pattern.state.kotlin

/**
 * @author djh on  2018/11/12 22:22
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = Context()
        context.state = PowerOffState()
    
        context.contorlTurnUpVolume()
    
        context.state = PowerOnState()
        
        context.controlToNextChannel()
    }
}