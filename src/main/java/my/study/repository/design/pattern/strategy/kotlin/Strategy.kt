package my.study.repository.design.pattern.strategy.kotlin

/**
 * @author djh on  2018/10/15 19:40
 * @E-Mail 1544579459@qq.com
 */
object Strategy {
    
    val busPrice: (distance: Int) -> Float = { it: Int ->
        if (it < 10) {
            1.0f
        } else {
            1 + (it - 10) * 1f
        }
    }
    
    val taxiPrice: (distance: Int) -> Float = { it: Int ->
        if (it < 8) {
            8f
        } else {
            8 + (it - 8) * 0.8f
        }
    }
    
}