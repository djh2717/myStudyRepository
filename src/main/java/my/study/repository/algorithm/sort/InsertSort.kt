@file:Suppress("UNCHECKED_CAST")

package my.study.repository.algorithm.sort

import java.util.*

/**
 * @author djh on  2018/9/30 19:39
 * @E-Mail 1544579459@qq.com
 */
object InsertSort {
    
    private fun isLess(a: Comparable<Any>, b: Comparable<*>) = a < b
    
    private fun exchange(arrayOfComparable: Array<Comparable<Any>>, a: Int, b: Int) {
        val temp = arrayOfComparable[a]
        arrayOfComparable[a] = arrayOfComparable[b]
        arrayOfComparable[b] = temp
    }
    
    private fun show(arrayOfComparable: Array<Comparable<Any>>) {
        for (comparable in arrayOfComparable) {
            print("$comparable ")
        }
    }
    
    private fun isSortSuccess(arrayOfComparable: Array<Comparable<Any>>): Boolean {
        for (i in 1 until arrayOfComparable.size) {
            if (isLess(arrayOfComparable[i], arrayOfComparable[i - 1])) {
                return false
            }
        }
        return true
    }
    
    private fun sort(comparable: Array<Comparable<Any>>) {
        for (i in 1 until comparable.size) {
            for (n in i downTo 1) {
                if (isLess(comparable[n], comparable[n - 1])) {
                    exchange(comparable, n, n - 1)
                }
            }
        }
    }
    
    @JvmStatic
    fun main(args: Array<String>) {
        val random = Random()
        val ints = Array<Comparable<Int>>(20) { 0 }
        for (i in 0..19) {
            ints[i] = random.nextInt(100)
        }

        val arrayOfComparable = (ints as? Array<Comparable<Any>>)!!
        
        sort(arrayOfComparable)
        isSortSuccess(arrayOfComparable)
        show(arrayOfComparable)
    }
}