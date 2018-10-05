package my.study.repository.design.pattern.flyweight.kotlin

/**
 * @author djh on  2018/10/5 19:04
 * @E-Mail 1544579459@qq.com
 */
class TicketImp(
        private val price: Int,
        private val toPlace: String,
        private val fromPlace: String) : Ticket {
    
    override fun showTicketInfo(bunk: String) {
        println("起点站: $fromPlace -> 终点站: $toPlace, 铺位: $bunk, 价格: $price")
    }
}