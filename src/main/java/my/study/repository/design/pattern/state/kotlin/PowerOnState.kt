package my.study.repository.design.pattern.state.kotlin

/**
 * @author djh on  2018/11/12 22:24
 * @E-Mail 1544579459@qq.com
 */
class PowerOnState : State {
    override fun nextChannel() {
        println("下一频道")
    }
    
    override fun turnUpVolume() {
        println("下一频道")
    }
    
    override fun turnDownVolume() {
        println("下一频道")
    }
}