package my.study.repository.design.pattern.factory.kotlin

/**
 * @author djh on  2018/10/5 18:56
 * @E-Mail 1544579459@qq.com
 */
class EasyFactory {
    companion object {
        
        fun getBmwSix() = BMWSix(68)
        
        fun getBmwThree() = BMWThree(33)
    }
}



