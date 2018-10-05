package my.study.repository.design.pattern.flyweight.kotlin

import java.util.*

/**
 * @author djh on  2018/10/5 19:05
 * @E-Mail 1544579459@qq.com
 */

private val ticketMap = HashMap<String, Ticket>(16)

fun getTicket(fromPlace: String, toPlace: String): Ticket =
        if (ticketMap.containsKey("$fromPlace-$toPlace")) {
            ticketMap.get("$fromPlace-$toPlace")!!
        } else {
            val ticket = TicketImp(Random().nextInt(500), toPlace, fromPlace)
            ticketMap.put("$fromPlace-$toPlace", ticket)
            ticket
        }