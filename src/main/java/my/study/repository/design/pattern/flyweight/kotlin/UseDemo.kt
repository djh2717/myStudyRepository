package my.study.repository.design.pattern.flyweight.kotlin

/**
 * @author djh on  2018/10/5 19:02
 * @E-Mail 1544579459@qq.com
 */
object UseDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val ticket = getTicket("上海", "北京")
        ticket.showTicketInfo("上铺")

        val ticket2 = getTicket("上海", "北京")
        ticket2.showTicketInfo("下铺")
    }
}