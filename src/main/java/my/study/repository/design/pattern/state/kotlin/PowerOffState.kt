package my.study.repository.design.pattern.state.kotlin

/**
 * @author djh on  2018/11/12 22:24
 * @E-Mail 1544579459@qq.com
 */
class PowerOffState : State {
    override fun nextChannel() {
        println("关机状态,无法操作")
    }
    
    override fun turnUpVolume() {
        println("关机状态,无法操作")
    }
    
    override fun turnDownVolume() {
        println("关机状态,无法操作")
    }
}