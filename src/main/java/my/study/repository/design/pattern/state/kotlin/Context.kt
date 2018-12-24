package my.study.repository.design.pattern.state.kotlin

/**
 * @author djh on  2018/11/12 22:23
 * @E-Mail 1544579459@qq.com
 */
class Context {
    
    lateinit var state: State
    
    fun controlToNextChannel() {
        state.nextChannel()
    }
    
    fun contorlTurnUpVolume() {
        state.turnUpVolume()
    }
}